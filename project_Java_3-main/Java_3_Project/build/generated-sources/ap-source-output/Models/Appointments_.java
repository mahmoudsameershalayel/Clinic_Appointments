package Models;

import Models.BookedAppointments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="٢٠٢٣-٠٦-١٠T٢٠:١١:١١")
@StaticMetamodel(Appointments.class)
public class Appointments_ { 

    public static volatile CollectionAttribute<Appointments, BookedAppointments> bookedAppointmentsCollection;
    public static volatile SingularAttribute<Appointments, Date> appointmentTime;
    public static volatile SingularAttribute<Appointments, Integer> id;
    public static volatile SingularAttribute<Appointments, Date> appointmentDate;
    public static volatile SingularAttribute<Appointments, Integer> appointmentDay;
    public static volatile SingularAttribute<Appointments, String> status;

}