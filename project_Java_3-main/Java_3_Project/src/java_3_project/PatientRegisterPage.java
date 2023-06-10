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
public class PatientRegisterPage extends Stage {

    private Scene PatientRegisterScene;

    public PatientRegisterPage() throws IOException {
       FXMLLoader loader= new FXMLLoader(getClass().getResource("PatientRegisterPage.fxml"));
        Parent p = loader.load();
        PatientRegisterScene = new Scene(p);
        this.setScene(PatientRegisterScene);
        this.setTitle("Register Page");
    }
}
