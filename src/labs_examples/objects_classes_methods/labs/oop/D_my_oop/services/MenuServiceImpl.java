package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import java.util.Scanner;

public class MenuServiceImpl implements Menu {
    int menuChoice;

    public MenuServiceImpl() {
        this.menuChoice = 0;
    }

    public int selectFromMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Menu -");
        System.out.println("[1] Add a new Client");
        System.out.println("[2] Add an Appointment to Existing Client");
        System.out.println("[3] View existing Clients");
        System.out.println("[4] Exit");
        return scanner.nextInt();
    }

}
