package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Appointment;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Product;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.SalonService;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentsImpl implements Appointments {
    ClientsImpl clients;
    Scanner scanner = new Scanner(System.in);
    String answer;
    Client client;

    public AppointmentsImpl(ClientsImpl clientImpl) {
        this.clients = clientImpl;
    }

    @Override
    public void addAppointmentToChart(Appointment appointment) {
        ArrayList<Appointment> chart = new ArrayList<>();
        chart.add(appointment);
        System.out.println("Chart entry added");
        System.out.println(chart);
    }

    //TODO: continue to modularize
    @Override
    public void createAppointmentForExistingClient() {
        Client client;
        client = clients.searchClient();
        ArrayList salonServices = new ArrayList();
        ArrayList productList = new ArrayList();
        Appointment appointment = new Appointment(client);
        Scanner scanner = new Scanner(System.in);
        String answer;

        //logic to create an appointment

        System.out.println("Chart entry for: " + client.getFirstName() +
                " " + client.getLastName());

        appointment.setDate(client.getDate());


        // get services
        SalonService salonService = new SalonService();
        enterTypeOfService(salonService);
        salonServices.add(salonService);
        answer = getYOrNAnswerForServiceEntry();
        while (answer.equalsIgnoreCase("y")) {
            salonService = new SalonService();
            enterTypeOfService(salonService);
            salonServices.add(salonService);
            answer = getYOrNAnswerForServiceEntry();

        }
        // create array list of salonServices and pass in salonService
        appointment.setServices(salonServices);
        //get products
        System.out.println("- Add a product -");
        Product product = new Product();
        enterBrandAndTypeOFProduct(product);
        productList.add(product);
        answer = getYOrNAnswerForProductEntry();
        while (answer.equalsIgnoreCase("y")) {
            enterBrandAndTypeOFProduct(product);
            productList.add(product);
            answer = getYOrNAnswerForProductEntry();
        }

        //TODO fix the toString
        appointment.setProducts(productList);
        // get notes
        System.out.println("- Enter notes about service(s) -");
        System.out.println();
//        scanner.nextLine();
        answer = scanner.nextLine();
        appointment.setNotes(answer);

        System.out.println("Display Chart:");
        // add appointment to chart
        addAppointmentToChart(appointment);
    }

    public void enterTypeOfService(SalonService salonService) {
        System.out.println("Enter type of service");
        answer = scanner.next();
        salonService.addServiceToServices(answer);
    }

    public void enterBrandAndTypeOFProduct(Product product) {
        System.out.println("Brand name");
        answer = scanner.next();
        product.setBrand(answer);
        System.out.println("Type of Product");
        answer = scanner.next();
        product.setTypeOfProduct(answer);
        product.addProductToProducts(product.getBrand(), product.getTypeOfProduct());
    }

    public String getYOrNAnswerForServiceEntry() {
        System.out.println("Add an additional service? (y/n)");
        answer = scanner.next();
        return answer;
    }

    public String getYOrNAnswerForProductEntry() {
        System.out.println("Add an additional product? (y/n)");
        answer = scanner.next();
        return answer;
    }


}