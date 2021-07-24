package labs_examples.input_output.labs.Exercise_4;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CSV_Parse_Client {

    public static void main(String[] args) throws IOException {
        ArrayList<Client> clients = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/clients.csv";


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(createClientFile().toString());

        }


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                clients.add(mapValuesToClientsObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Client client : clients) {
            System.out.println(client.toString());
        }

    }


    private static Client mapValuesToClientsObject(String[] values) {
        Client client = new Client();
        client.setFirstName(values[0]);
        client.setLastName(values[1]);
        client.setEmail(values[2]);
        client.setPhoneNumber(values[3]);

        return client;
    }

    private static Client createClientFile() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        Client client = new Client();

        System.out.println("Enter first name");
        answer = scanner.next();
        client.setFirstName(answer);
        System.out.println("Enter last name");
        answer = scanner.next();
        client.setLastName(answer);
        System.out.println("Enter email");
        answer = scanner.next();
        client.setEmail(answer);
        System.out.println("Enter phone number");
        answer = scanner.next();
        client.setPhoneNumber(answer);

        return client;
    }

}
