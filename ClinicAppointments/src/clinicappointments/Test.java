/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicappointments;

import Controllers.UserJpaController;
import Models.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author HP-DALAL
 */
public class Test {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicAppointmentsPU");
        UserJpaController uj = new UserJpaController(emf);
        User u = new User(null, "admin", "admin", "admin", "admin", 30, "admin@admin.com", "+970594857483", "male", "admin");
        uj.create(u);
    }

}
