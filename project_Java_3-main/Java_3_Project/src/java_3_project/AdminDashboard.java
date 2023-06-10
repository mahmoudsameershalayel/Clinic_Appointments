/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_3_project;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP-DALAL
 */
public class AdminDashboard extends Stage {

    private Scene patientScene;
    private Scene freeAppointmentsScene;
    private Scene bookedAppointmentsScene;
    private Scene createPatientScene;
    public AdminDashboard() throws IOException {
        FXMLLoader patientSceneLoader = new FXMLLoader(getClass().getResource("AdminDashboard.fxml"));
        Parent patientRoot = patientSceneLoader.load();
        patientScene = new Scene(patientRoot);

        FXMLLoader freeAppointmentsSceneLoader = new FXMLLoader(getClass().getResource("FreeAppointments.fxml"));
        Parent freeAppointmentsRoot = freeAppointmentsSceneLoader.load();
        freeAppointmentsScene = new Scene(freeAppointmentsRoot);

        FXMLLoader bookedAppointmentsSceneLoader = new FXMLLoader(getClass().getResource("BookedAppointments.fxml"));
        Parent bookedAppointmentsRoot = bookedAppointmentsSceneLoader.load();
        bookedAppointmentsScene = new Scene(bookedAppointmentsRoot);

        FXMLLoader createPatientSceneLoader = new FXMLLoader(getClass().getResource("CreatePatient.fxml"));
        Parent createPatientRoot = createPatientSceneLoader.load();
        createPatientScene = new Scene(createPatientRoot);

        this.setScene(patientScene);
        this.setTitle("Patient Page");
    }

    public void changeSceneToPatientScene() {
        this.setScene(patientScene);
    }

    public void changeSceneToFreeAppointmentsScene() {
        this.setScene(freeAppointmentsScene);
    }

    public void changeSceneToBookedAppointmentsScene() {
        this.setScene(bookedAppointmentsScene);
    }

    public void changeSceneToCreatePatientScene() {
        this.setScene(createPatientScene);
    }
    
}
