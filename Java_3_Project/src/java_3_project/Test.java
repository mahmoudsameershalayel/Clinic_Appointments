/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_3_project;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jit
 */
public class Test extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader l= new FXMLLoader(getClass().getResource("BookedAppointments.fxml"));
        Parent p = l.load();
        Scene s = new Scene(p);
        primaryStage.setScene(s);
        primaryStage.setTitle("Accounts Screne");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
