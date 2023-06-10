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
public class PatientLogin extends Stage{

    private Scene PatientLoginScene;

    public PatientLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PatientLogin.fxml"));
        Parent p = loader.load();
        PatientLoginScene = new Scene(p);
        this.setScene(PatientLoginScene);
        this.setTitle("Patient Login Page");
    }
}
