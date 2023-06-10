/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Controllers.exceptions.NonexistentEntityException;
import Models.User;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_3_project.ViewManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class AdminDashboardController implements Initializable {

    public static User selectedUser;
    public static Stage updateStage;

    @FXML
    private Button patientpagebtn;
    @FXML
    private Button freeAppointmentpagebtn;
    @FXML
    private Button bookedAppointmentpagebtn;
    @FXML
    private Button logoutbtn;
    @FXML
    private TextField searchtxt;
    @FXML
    private Button searchbtn;
    @FXML
    private Button newPatientbtn;
    @FXML
    private Button allPatientbtn;
    @FXML
    private Button updatebtn;
    @FXML
    private Button deletebtn;
    @FXML
    private TableView<User> patientsTableView;
    @FXML
    private TableColumn<User, Integer> idCol;
    @FXML
    private TableColumn<User, String> usernameCol;
    @FXML
    private TableColumn<User, String> passwordCol;
    @FXML
    private TableColumn<User, String> firstnameCol;
    @FXML
    private TableColumn<User, String> lastnameCol;
    @FXML
    private TableColumn<User, Integer> ageCol;
    @FXML
    private TableColumn<User, String> emailCol;
    @FXML
    private TableColumn<User, String> phoneCol;
    @FXML
    private TableColumn<User, String> genderCol;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_3_ProjectPU");
    UserJpaController ujc = new UserJpaController(emf);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        idCol.setCellValueFactory(new PropertyValueFactory("id"));
        usernameCol.setCellValueFactory(new PropertyValueFactory("username"));
        passwordCol.setCellValueFactory(new PropertyValueFactory("password"));
        emailCol.setCellValueFactory(new PropertyValueFactory("email"));
        firstnameCol.setCellValueFactory(new PropertyValueFactory("firstname"));
        lastnameCol.setCellValueFactory(new PropertyValueFactory("lastname"));
        ageCol.setCellValueFactory(new PropertyValueFactory("age"));
        genderCol.setCellValueFactory(new PropertyValueFactory("gender"));
        phoneCol.setCellValueFactory(new PropertyValueFactory("phone"));
    }

    @FXML
    private void patientpagebtnAction(ActionEvent event) {
    }

    @FXML
    private void freeAppointmentpagebtnAction(ActionEvent event) {
        ViewManager.adminDashboard.changeSceneToFreeAppointmentsScene();
    }

    @FXML
    private void bookedAppointmentpagebtnAction(ActionEvent event) {
        ViewManager.adminDashboard.changeSceneToBookedAppointmentsScene();
    }

    @FXML
    private void logoutbtnAction(ActionEvent event) throws IOException {
        ViewManager.openPatientLoginPage();
        ViewManager.closeAdminDashboardPage();
    }

    @FXML
    private void searchbtnAction(ActionEvent event) {
    }

    @FXML
    private void newPatientbtnAction(ActionEvent event) {
        ViewManager.adminDashboard.changeSceneToCreatePatientScene();
    }

    @FXML
    private void allPatientbtnAction(ActionEvent event) {
        List<User> allUsers = ujc.findUserEntities();
        List<User> patientUsers = new ArrayList<>();
        for (User u : allUsers) {
            if (!u.getRole().equals("admin")) {
                patientUsers.add(u);
            }
        }
        ObservableList<User> usersList
                = FXCollections.observableArrayList(patientUsers);
        patientsTableView.setItems(usersList);
    }

    @FXML
    private void updatebtnAction(ActionEvent event) throws IOException {
        if (patientsTableView.getSelectionModel().getSelectedItem() != null) {
            selectedUser = patientsTableView.getSelectionModel().getSelectedItem();
            
            FXMLLoader loaderUpdate = new FXMLLoader(getClass().getResource("../java_3_project/UpdatePatient.fxml"));
            Parent rootUpdate = loaderUpdate.load();
            Scene updateUserScene = new Scene(rootUpdate);

            updateStage = new Stage();
            updateStage.setScene(updateUserScene);
            updateStage.setTitle("Update user " + selectedUser.getUsername());
            updateStage.show();
        }
    }

    @FXML
    private void deletebtnAction(ActionEvent event) {
        if (patientsTableView.getSelectionModel().getSelectedItem() != null) {
            User user = patientsTableView.getSelectionModel().getSelectedItem();
            Alert deleteConfirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            deleteConfirmAlert.setTitle("User delete");
            deleteConfirmAlert.setContentText("Are you sure to delete this user ?");
            deleteConfirmAlert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    try {
                        ujc.destroy(user.getId());
                    } catch (NonexistentEntityException ex) {
                        Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Alert deletedSuccessAlert = new Alert(Alert.AlertType.INFORMATION);
                    deletedSuccessAlert.setTitle("User deleted");
                    deletedSuccessAlert.setContentText("User deleted");
                    deletedSuccessAlert.show();
                }
            });
        } else {
            Alert warnAlert = new Alert(Alert.AlertType.WARNING);
            warnAlert.setTitle("Select an user");
            warnAlert.setContentText("Please select an user from the table view");
            warnAlert.show();
        }
    }

}
