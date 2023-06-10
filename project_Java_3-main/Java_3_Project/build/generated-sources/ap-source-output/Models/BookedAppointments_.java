package Models;

import Models.Appointments;
import Models.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="٢٠٢٣-٠٦-١٠T٢٠:١١:١١")
@StaticMetamodel(BookedAppointments.class)
public class BookedAppointments_ { 

    public static volatile SingularAttribute<BookedAppointments, Appointments> appointmentId;
    public static volatile SingularAttribute<BookedAppointments, Integer> id;
    public static volatile SingularAttribute<BookedAppointments, User> userId;
    public static volatile SingularAttribute<BookedAppointments, String> status;

}