/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 *
 * @author HP-DALAL
 */
public class ViewManager {

    private static PatientRegisterPage registerPage;

    private ViewManager() {
    }
    public static void openPatientRegisterPage() throws IOException {
        if (registerPage == null) {
            registerPage = new PatientRegisterPage();
            registerPage.show();
        }else{
          registerPage.show();
        }
    }

}
