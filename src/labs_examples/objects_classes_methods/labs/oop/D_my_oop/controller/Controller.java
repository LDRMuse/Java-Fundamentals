package labs_examples.objects_classes_methods.labs.oop.D_my_oop.controller;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.AppointmentsImpl;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.ClientsImpl;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.MenuServiceImpl;


public class Controller {

    public static void main(String[] args) {

        runApp();

    }


        public static void runApp() {
            ClientsImpl clientImpl = new ClientsImpl();
            MenuServiceImpl menu = new MenuServiceImpl();

            System.out.println("--- Client Management Application ---");
            System.out.println("");

            do {
                int menuChoice = menu.selectFromMenu();

                switch (menuChoice) {
                    case 1:
                        clientImpl.createNewClient();
                        break;
                    case 2:
                        AppointmentsImpl app = new AppointmentsImpl(clientImpl);
                        app.createAppointmentForExistingClient();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("you chose 3");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Menu");
                }

            } while (true);
        }


}
