package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Appointment;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;

public interface Appointments {

     void addAppointmentToChart(Appointment appointment);

     void createAppointmentForExistingClient(Client client);

}