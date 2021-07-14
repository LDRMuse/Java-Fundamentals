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

        if (Player.numberOfGamesPlayed == 0) {
            human.askPlayersName(human);
        }

        while (human.getPotValue() >= 1 && computer.getPotValue() >= 1) {
            Player.numberOfGamesPlayed++;
            System.out.println("Lets play, " + human.getName() + "! Game: " + Player.numberOfGamesPlayed);
            int moneyToBet = human.askBetAmount(human);

            if (Player.isNewGame()) {
                deck = new Deck();
                human.setHand(new Hand());
                computer.setHand(new Hand());
            }
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

                if (answer.equalsIgnoreCase("y")) {
                    deck.deal(human);
                    System.out.println(human.getHand());
                    if (human.hand.getHandValue() > 21) {
                        Player.computerWinner(human, computer);
                        System.out.println("You busted and got a total of " + human.hand.getHandValue() + ". Computer wins this time! ");
                        computer.countNumberOfGamesWon();
                        human.handleBets(human, computer, moneyToBet);
                        computer.setWinner(false);
                        break;
                    }
                    if (human.hand.getHandValue() == 21) {
                        Player.humanWinner(human, computer);
                        System.out.println("Score: " + human.hand.getHandValue() + ". You won! ");
                        human.countNumberOfGamesWon();
                        human.handleBets(human, computer, moneyToBet);
                        human.setWinner(false);
                        break;
                    }
                }

                //STAY
                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("You have chosen to stay. Score: " + human.hand.getHandValue());
                    human.setWinner(true);
                    computer.setWinner(true);
                    break;
                }

            } while (answer.equalsIgnoreCase("y"));

            if (!human.isWinner() || !computer.isWinner()) {
                continue;
            }

            human.setWinner(false);
            computer.setWinner(false);
            System.out.println();
            System.out.println("- Computers turn -");
            System.out.println();

            while (computer.computerAI() && !computer.isWinner() && !human.isWinner()) {
                //DRAW CARD
                deck.deal(computer);
                if (computer.hand.getHandValue() == 21) {
                    Player.computerWinner(human, computer);
                    System.out.println("Blackjack! Computer won.");
                    computer.countNumberOfGamesWon();
                    human.handleBets(human, computer, moneyToBet);
                }
                if (computer.hand.getHandValue() > 21) {
                    Player.humanWinner(human, computer);
                    human.countNumberOfGamesWon();
                    System.out.println("Computers hand: " + computer.getHand());
                    System.out.println("Computer busted and got a total of " + computer.hand.getHandValue() + ". " + human.getName() + " wins this time!");
                    human.handleBets(human, computer, moneyToBet);
                }
            }

            if (human.getPotValue() != 0 && computer.getPotValue() != 0) {
                System.out.println("Computers hand: " + computer.getHand());
                System.out.println("Computer has chosen to stay!");
                int totalComputerScore = computer.hand.getHandValue();
                int totalHumanScore = human.hand.getHandValue();

                if (totalComputerScore > totalHumanScore) {
                    Player.computerWinner(human, computer);
                    computer.countNumberOfGamesWon();
                    System.out.println("Both players have decided to stay. The winner is " + computer.getName() + " with a score of " + totalComputerScore + ".");
                } else {
                    human.countNumberOfGamesWon();
                    Player.humanWinner(human, computer);
                    System.out.println("Both players have decided to stay. The winner is " + human.getName() + " with a score of " + totalHumanScore + ".");
                }
                human.handleBets(human, computer, moneyToBet);

            }
        }

        if (computer.getPotValue() > human.getPotValue()) {
            System.out.println(computer.getName() + " won the full pot and collects $" + computer.getPotValue());
        } else {
            System.out.println(human.getName() + " won the full pot and collects $" + human.getPotValue());
        }

        System.out.println("Number of games won by " + human.getName() + ": " + human.getNumberOfGamesWon());
        System.out.println("Number of games won by " + computer.getName() + ": " + computer.getNumberOfGamesWon());

    }

}
