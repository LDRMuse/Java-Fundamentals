package labs_examples.objects_classes_methods.labs.oop.D_my_oop.controller;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.ChartEntry;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Person;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Products;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.services.ChartEntriesImpl;

import java.util.Scanner;

public class ChartingController {
    public static void main(String[] args) {
        Person client = new Person();
        Products products = new Products();
        ChartEntriesImpl chartEntriesImpl = new ChartEntriesImpl();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Add new client? (y/n)");

        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {

            System.out.println("- Chart Client -");

            System.out.println("First name");
            answer = scanner.next();
            client.setFirstName(answer);
            System.out.println("Last name");
            answer = scanner.next();
            client.setLastName(answer);
            System.out.println("Email");
            answer = scanner.next();
            client.setEmail(answer);
            System.out.println("Phone");
            answer = scanner.next();
            client.setPhone(answer);
            client.setAdmin(false);

            System.out.println("Client Created on " + client.getDate());
            System.out.println(client);
        }

        System.out.println("Add products used? (y/n)");
        answer = scanner.next();

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("- Chart products -");

            System.out.println("Brand");
            answer = scanner.next();
            products.setBrand(answer);
            System.out.println("Type of Product");
            answer = scanner.next();
            products.setTypeOfProduct(answer);

            System.out.println(products);
            System.out.println("Add another product? (y/n)");
            answer = scanner.next();

            products.setProducts(products.getBrand(), products.getProductType());
        }


        System.out.println("Create Chart entry? (y/n)");
        answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            ChartEntry chartEntry = new ChartEntry(client);
            chartEntry.setDate(client.getDate());
            System.out.println("Type of Service");
            answer = scanner.next();
            chartEntry.setTypeOfService(answer);
            chartEntry.setProductsUsed(products);
            //TODO: Figure out how to get the full string with spaces
            System.out.println("Notes on service:");
            answer = scanner.next();
            chartEntry.setNotes(answer);

            chartEntriesImpl.addChartEntryToChart(chartEntry);

        }


    }
}
