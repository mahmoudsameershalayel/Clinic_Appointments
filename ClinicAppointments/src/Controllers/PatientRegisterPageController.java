/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class PatientRegisterPageController implements Initializable {

    @FXML
    private ToggleGroup genderToggleGroup;
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
    private RadioButton female;
    @FXML
    private Button signUpBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signUpBtnHandle(ActionEvent event) {
        System.out.println(String.valueOf(male.isSelected()));
    }
    
}
