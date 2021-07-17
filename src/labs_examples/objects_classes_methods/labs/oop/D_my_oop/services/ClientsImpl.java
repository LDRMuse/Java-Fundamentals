package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientsImpl implements Clients {
    private static final ArrayList<Client> clients = new ArrayList<>();

    public static ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public void createNewClient() {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Chart Client -");

        String answer;

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

        System.out.println("Client Created on " + client.getDate());
        System.out.println(client);
        clients.add(client);
    }

    @Override
    public Client searchClient() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("Enter last name of client");
        answer = scanner.next();
        ArrayList<Client> searchedClient = new ArrayList<>();

        for (Client client : clients) {
            if ((client.getLastName().equalsIgnoreCase(answer))) {
                searchedClient.add(client);
                System.out.println(searchedClient.get(0));
                return searchedClient.get(0);
            } else {
                System.out.println("No results for your search");
            }

        }

        return searchedClient.get(0);
    }

}
