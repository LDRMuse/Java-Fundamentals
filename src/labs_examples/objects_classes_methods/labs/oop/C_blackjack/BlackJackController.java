package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {

        playBlackJack();
    }

    public static void playBlackJack() {

        Player human = new Player();
        Player computer = new Player();
        Deck deck = new Deck();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        human.setName(name);

        // deal human and computer 2 cards
        deck.deal(human);
        deck.deal(human);
        deck.deal(computer);
        deck.deal(computer);

        System.out.println("Your hand: " + human.getHand());

        String answer;

        do {
            System.out.println("Would you like another card? (y/n)");
            answer = scanner.next();

            //BUST
            if (answer.equalsIgnoreCase("y")) {
                deck.deal(human);
                System.out.println(human.hand.getHandValue());
                if (human.hand.getHandValue() > 21) {
                    System.out.println("You busted and got a total of " + human.hand.getHandValue() + ". Computer wins this time! ");
                    System.exit(0);
                }
            }
            //STAY
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("You have chosen to stay. Score: " + human.hand.getHandValue());
            }

        } while (answer.equalsIgnoreCase("y"));


        do {
            System.out.println("");
            System.out.println("- Computers turn -");
            System.out.println("");
            //DRAW CARD
            while (computer.computerAI()) {
                deck.deal(computer);
                if(computer.hand.getHandValue() == 15){
                    System.out.println("Blackjack! Computer won.");
                    System.exit(0);
                }
                if (computer.hand.getHandValue() > 21) {
                    System.out.println("Computer busted and got a total of " + computer.hand.getHandValue() + ". " + human.getName() + " wins this time!");
                    System.exit(0);
                }
            }
                System.out.println("Computer has chosen to stay!");
                int totalComputerScore = computer.hand.getHandValue();
                int totalHumanScore = human.hand.getHandValue();

                if(totalComputerScore > totalHumanScore){
                    System.out.println("Both players have decided to stay. The winner is " + computer.getName() + " with a score of " +  totalComputerScore + ".");
                } else {
                    System.out.println("Both players have decided to stay. The winner is " + human.getName() + " with a score of " + totalHumanScore + ".");
                }

        } while (computer.computerAI());


    }

}
