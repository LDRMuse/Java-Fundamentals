package labs_examples.objects_classes_methods.labs.oop.D_my_oop.controller;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.AppointmentsImpl;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.ClientsImpl;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.MenuServiceImpl;


//TODO: figure out why the toString is displaying null for products and services

public class Controller {

    public static void main(String[] args) {

        runApp();

    }


        public static ClientsImpl runApp() {
            ClientsImpl clientImpl = new ClientsImpl();
            MenuServiceImpl menu = new MenuServiceImpl();
            Client client = new Client();


            System.out.println("--- Client Management Application ---");
            System.out.println("");

            do {
                int menuChoice = menu.selectFromMenu();

                switch (menuChoice) {
                    case 1:
                        clientImpl.createNewClient(client);
                        break;
                    case 2:
                        AppointmentsImpl app = new AppointmentsImpl(client, clientImpl);
                        app.createAppointmentForExistingClient(client);
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
