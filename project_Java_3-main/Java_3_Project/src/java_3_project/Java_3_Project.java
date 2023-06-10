/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_3_project;

import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author jit
 */
public class Java_3_Project {

    /**
     * @param args the command line arguments
     */
    public void start(Stage primaryStage) throws Exception {
            ViewManager.openPatientLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
