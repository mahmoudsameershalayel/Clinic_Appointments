/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java_3_project.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class AdminLoginController implements Initializable {

    @FXML
    private TextField usernametxtAdmin;
    @FXML
    private PasswordField passwordtxtAdmin;
    @FXML
    private Button loginbtnAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginbtnAdminAction(ActionEvent event) throws IOException {
        String username = this.usernametxtAdmin.getText();
        String password = this.passwordtxtAdmin.getText();
        if (username.equals(username) && password.equals(password)) {
            System.out.println("success!!");
            ViewManager.openAdminDashboardPage();
            ViewManager.closeAdminLoginPage();
        }
    }

}
