package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int potValue;
    boolean winner;
    static int numberOfGamesPlayed;
    static boolean newGame;
    int numberOfGamesWon;
    boolean stay;

    public Player() {
        // default name of player
        this.name = "Computer";
        this.hand = new Hand();
        this.potValue = 200;
        this.winner = false;
        newGame = false;
        numberOfGamesWon = 0;
        this.stay = false;
    }

    public boolean computerAI() {
        return this.hand.scoreOfTheHand() < 16;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return this.potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }


    public static boolean isNewGame() {
        return newGame;
    }

    public static void setNewGame(boolean newGame) {
        Player.newGame = newGame;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getNumberOfGamesWon() {
        return numberOfGamesWon;
    }


    public void countNumberOfGamesWon() {
        numberOfGamesWon++;
    }

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    public boolean isStay() {
        return stay;
    }

    public void askPlayersName(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to BlackJack! What is your name?");
        this.name = scanner.next();
        player.setName(name);
    }


    public int askBetAmount(Player human) {
        Scanner scanner = new Scanner(System.in);
        int moneyToBet;
        System.out.println("How much money would like to bet? You currently have $" + human.getPotValue());

        while (!scanner.hasNextInt()) {
            System.out.println("Please bet a real number..");
            scanner.next();
        }
        moneyToBet = scanner.nextInt();

        while (moneyToBet < 0) {
            System.out.println("You cannot bet negative numbers..");
            System.out.println("Out of your pot value of $" + human.getPotValue() + ", how much money would you like to bet?");

            moneyToBet = scanner.nextInt();
        }

        while (moneyToBet > human.getPotValue()) {
            System.out.println("You cannot bet more money than you have..");
            System.out.println("Out of your pot value of $" + human.getPotValue() + ", how much money would you like to bet?");

            while (!scanner.hasNextInt()) {
                System.out.println("Please bet a real number..");
                scanner.next();
            }

            moneyToBet = scanner.nextInt();
        }
        return moneyToBet;
    }

    public void handleBets(Player human, Player computer, int moneyToBet) {
        if (human.isWinner() && !computer.isWinner()) {
            human.setPotValue(human.getPotValue() + moneyToBet);
            computer.setPotValue(computer.getPotValue() - moneyToBet);
        } if (!human.isWinner() && computer.isWinner()) {
            human.setPotValue(human.getPotValue() - moneyToBet);
            computer.setPotValue(computer.getPotValue() + moneyToBet);
        }
        if (!human.isWinner() && !computer.isWinner()) {
            human.setPotValue(human.getPotValue() + moneyToBet);
            computer.setPotValue(computer.getPotValue() + moneyToBet);
        }
        keepTrackOfMoney(human,computer);
    }

    public static void keepTrackOfMoney(Player human, Player computer) {
        System.out.println("Your pot value is now $" + human.getPotValue());
        System.out.println("Computers pot value: $" + computer.getPotValue());
    }

    public static void humanWinner(Player human, Player computer) {
        human.setWinner(true);
        computer.setWinner(false);
        Player.setNewGame(true);
    }

    public static void computerWinner(Player human, Player computer) {
        human.setWinner(false);
        computer.setWinner(true);
        Player.setNewGame(true);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", pot value=" + potValue +
                '}';
    }
}
