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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP-DALAL
 */
public class BookedAppointmentsController implements Initializable {

    @FXML
    private Button patientpagebtn;
    @FXML
    private Button freeAppointmentpagebtn;
    @FXML
    private Button bookedAppointentpagebtn;
    @FXML
    private Button logoutbtn;
    @FXML
    private TextField searchtxt;
    @FXML
    private Button searchbtn;
    @FXML
    private Button allAppointmentbtn;
    @FXML
    private Button makeCommentbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void patientpagebtnAction(ActionEvent event) {
        ViewManager.adminDashboard.changeSceneToPatientScene();
    }

    @FXML
    private void freeAppointmentpagebtnAction(ActionEvent event) {
        ViewManager.adminDashboard.changeSceneToFreeAppointmentsScene();
    }

    @FXML
    private void bookedAppointentpagebtnAction(ActionEvent event) {
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
    private void allAppointmentbtnAction(ActionEvent event) {
    }

    @FXML
    private void makeCommentbtnAction(ActionEvent event) {
    }
    
}
