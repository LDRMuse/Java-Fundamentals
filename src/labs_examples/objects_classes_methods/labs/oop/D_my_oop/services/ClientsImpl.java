package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientsImpl implements Clients {
    private static final ArrayList<Client> clients = new ArrayList<>();

    @Override
    public Client createNewClient(Client client) {
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
        return client;
    }

    @Override
    public Client searchClient(Client client) {
        if (clients.contains(client)) {
            return client;
        } else {
            System.out.println("Client not found");
        }
        return client;
    }
}
