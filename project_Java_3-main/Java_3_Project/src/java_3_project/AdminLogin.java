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
public class AdminLogin extends Stage{
    private Scene adminLoginScene;
    public AdminLogin() throws IOException{
        FXMLLoader adminLoginLoader = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
        Parent adminLoginRoot = adminLoginLoader.load();
        adminLoginScene = new Scene(adminLoginRoot);
        this.setScene(adminLoginScene);
        this.setTitle("Admin Login");
    }
}
