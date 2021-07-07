package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


public class Card {

private String suit;
private String face;

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return face + suit;
    }
}
