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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class PatientRegisterPageController implements Initializable {

    @FXML
    private Button signUpBtn;
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
    }

    @FXML
    private void signUpBtnHandle(ActionEvent event) throws IOException {
        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        String phone = this.phone.getText();
        int age = Integer.parseInt(this.age.getText());
        String password = this.password.getText();
        String username = this.username.getText();
        String email = this.email.getText();
        String gender;
        if (this.male.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        User user = new User(null, username, password, firstName, lastName, age, email, phone, gender, "patient");
        ujc.create(user);
      
        ViewManager.closePatientRegisterPage();
        ViewManager.openPatientLoginPage();
    }

}
