/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_3_project;

import static java.lang.Math.log;
import java.lang.reflect.InvocationTargetException;
import static java.rmi.server.LogStream.log;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static jdk.jfr.internal.Logger.log;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 *
 * @author jit
 */
public class Test extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            ViewManager.openPatientLoginPage();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
