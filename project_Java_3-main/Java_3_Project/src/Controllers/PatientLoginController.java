/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.User;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java_3_project.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class PatientLoginController implements Initializable {

    @FXML
    private TextField usernametxtpatient;
    @FXML
    private PasswordField passwordtxtpatient;
    @FXML
    private Button registerbtnpatient;
    @FXML
    private Button loginbtnpatient;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java_3_ProjectPU");
    UserJpaController ujc = new UserJpaController(emf);
    @FXML
    private Button loginAsAdminBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void registerbtnpatientAction(ActionEvent event) throws IOException {
        ViewManager.openPatientRegisterPage();
    }

    @FXML
    private void loginbtnpatientAction(ActionEvent event) {
        String username = this.usernametxtpatient.getText();
        String password = this.passwordtxtpatient.getText();
        List<User> users = ujc.findUserEntities();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("success!!");
                break;
            }
        }
    }

    @FXML
    private void loginAsAdminHandle(ActionEvent event) throws IOException {
        ViewManager.openAdminLoginPage();
        ViewManager.closePatientLoginPage();
    }

}
