package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public int scoreOfTheHand() {
        int score = 0;

        for (Card card : this.getCards()) {
            if (card.getFace().equals("A")) {
                score += 1;
                this.setHandValue(score);
            }
            if (card.getFace().equals("2")) {
                score += 2;
            }
            if (card.getFace().equals("3")) {
                score += 3;
            }
            if (card.getFace().equals("4")) {
                score += 4;
            }
            if (card.getFace().equals("5")) {
                score += 5;
            }
            if (card.getFace().equals("6")) {
                score += 6;
            }
            if (card.getFace().equals("7")) {
                score += 7;
            }
            if (card.getFace().equals("8")) {
                score += 8;
            }
            if (card.getFace().equals("9")) {
                score += 9;
            }
            if (card.getFace().equals("10")) {
                score += 10;
            }
            if (card.getFace().equals("J")) {
                score += 10;
            }
            if (card.getFace().equals("Q")) {
                score += 10;
            }
            if (card.getFace().equals("K")) {
                score += 10;
            }
        }
        score = this.setHandValue(score);

        return score;
    }

    public boolean isGreaterThan21(Hand hand) {
        int score = scoreOfTheHand();
        return score > 21;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }


    public int getHandValue() {
        return handValue;
    }

    public int setHandValue(int handValue) {
        this.handValue = handValue;
        return handValue;
    }

    @Override
    public String toString() {
        return "" + cards +
                " Score: " + handValue;
    }
}
