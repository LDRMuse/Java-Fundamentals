package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;

    public Player(){
        // default name of player
        this.name = "Computer";
        this.hand = new Hand();
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


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}
