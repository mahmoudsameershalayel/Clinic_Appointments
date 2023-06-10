/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_3_project;

import java.io.IOException;

/**
 *
 * @author HP-DALAL
 */
public class ViewManager {

    public static PatientRegisterPage registerPage;
    public static PatientLogin patientLoginPage;
    public static AdminLogin adminLoginPage;
    public static AdminDashboard adminDashboard;

    private ViewManager() {
    }

    public static void openPatientRegisterPage() throws IOException {
        if (registerPage == null) {
            registerPage = new PatientRegisterPage();
            registerPage.show();
        } else {
            registerPage.show();
        }
    }

    public static void closePatientRegisterPage() {
        registerPage.close();
    }

    public static void openPatientLoginPage() throws IOException {
        if (patientLoginPage == null) {
            patientLoginPage = new PatientLogin();
            patientLoginPage.show();
        } else {
            patientLoginPage.show();
        }
    }

    public static void closePatientLoginPage() {
        patientLoginPage.close();
    }

    public static void openAdminDashboardPage() throws IOException {
        if (adminDashboard == null) {
            adminDashboard = new AdminDashboard();
        }
        adminDashboard.show();
    }

    public static void closeAdminDashboardPage() {
        adminDashboard.close();
    }

    public static void openAdminLoginPage() throws IOException {
        if (adminLoginPage == null) {
            adminLoginPage = new AdminLogin();
        }
        adminLoginPage.show();
    }

    public static void closeAdminLoginPage() {
        adminLoginPage.close();
    }

}
