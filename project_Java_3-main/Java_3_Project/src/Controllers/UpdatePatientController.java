/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.User;
import java.net.URL;
import java.util.ResourceBundle;
import java_3_project.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class UpdatePatientController implements Initializable {

    private User oldUser;

    @FXML
    private Button updatePatientBtn;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField phone;
    @FXML
    private TextField age;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private TextField email;
    @FXML
    private RadioButton male;
    @FXML
    private ToggleGroup genderToggleGroup;
    @FXML
    private RadioButton female;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_3_ProjectPU");
    UserJpaController ujc = new UserJpaController(emf);
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.oldUser = Controllers.AdminDashboardController.selectedUser;
        firstName.setText(oldUser.getFirstname());
        lastName.setText(oldUser.getLastname());
        password.setText(oldUser.getPassword());
        username.setText(oldUser.getUsername());
        phone.setText(oldUser.getPhone());
        age.setText(String.valueOf(oldUser.getAge()));
        email.setText(oldUser.getEmail());
        if (oldUser.getGender().equals("female")) {
            genderToggleGroup.selectToggle(female);
        }
    }

    @FXML
    private void updateBtnHandle(ActionEvent event) throws Exception {
        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        String userName = this.username.getText();
        String password = this.password.getText();
        int age = Integer.parseInt(this.age.getText());
        String phone = this.phone.getText();
        String email = this.email.getText();
        String gender;
        if (this.male.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        User user = new User(null, userName, password, firstName, lastName, age, email, phone, gender, "patient");
        user.setId(oldUser.getId());
        ujc.edit(user);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("User updated");
        alert.setContentText("User updated");
        alert.showAndWait();
        AdminDashboardController.updateStage.close();
    }

}
