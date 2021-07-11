package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards;
    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck() {
        this.cards = populateCardArray();
    }

    public static ArrayList<Card> populateCardArray() {
        ArrayList<Card> cards = new ArrayList<>();
        String[] suits = {"♠", "♦", "♥", "♣"};
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String suit : suits) {
            for (String face : faces) {
                cards.add(new Card(suit, face));
            }
        }
        return cards;
    }

    public void resetDeck() {
        this.cards = populateCardArray();
    }

    public void deal(Player player) {
        // calling generateRandomNumber and store it in a variable
        int randomNumber = this.generateRandomNumber();

        // while it's true that useCards array index contains the randomNumber, keep calling the generateRandomNumber and store it in a variable called randomNumber
        while(usedCards.contains(randomNumber)) {
            randomNumber = this.generateRandomNumber();
        }

        // in the cards array, get the card at the index of randomNumber and store it in a variable called card
        Card card = cards.get(randomNumber);
        // then add randomNumber to the usedCards array
        usedCards.add(randomNumber);

        // also add the card to the cardsArray in the hand object of the player
        player.hand.cards.add(card);
        // run the score method in the hand object that belongs to the player
        player.hand.scoreOfTheHand();

    }

    public int generateRandomNumber() {
        int max = 52;
        return (int) Math.floor(Math.random() * max);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                ", usedCards=" + usedCards +
                '}';
    }
}
