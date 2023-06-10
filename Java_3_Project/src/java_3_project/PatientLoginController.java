/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_3_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jit
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registerbtnpatientAction(ActionEvent event) {
    }

    @FXML
    private void loginbtnpatientAction(ActionEvent event) {
    }
    
}
