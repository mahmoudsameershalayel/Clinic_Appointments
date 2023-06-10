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
public class FreeAppointmentsController implements Initializable {

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
    private Button newAppointmentbtn;
    @FXML
    private Button allAppointmentbtn;
    @FXML
    private Button updatebtn;
    @FXML
    private Button deletebtn;

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
    }

    @FXML
    private void bookedAppointentpagebtnAction(ActionEvent event) {
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
    private void newAppointmentbtnAction(ActionEvent event) {
    }

    @FXML
    private void allAppointmentbtnAction(ActionEvent event) {
    }

    @FXML
    private void updatebtnAction(ActionEvent event) {
    }

    @FXML
    private void deletebtnAction(ActionEvent event) {
    }
    
}
