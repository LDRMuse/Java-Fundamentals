package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 * <p>
 * 1) Create a custom exception.
 * 2) Demonstrate a method throwing your custom exception.
 */

class runApp {
    public static void main(String[] args) {
        int money = 5;
        try {
            buyABoat(money);
            // We already created the obj when we typed "throws new MoneyException();
            // new we are naming that obj me
        } catch (MoneyException me) {
            // MoneyException class has only one method to use which is toString();
            // so we call the instance me.toString();
            System.out.println(me.toString());
        }

    }

    public static void buyABoat(int money) throws MoneyException {
        int oneMillion = 1_000_000;
        if (money > oneMillion) {
            System.out.println("Yay you can buy a boat");
        } else {
            // we are creating a new object by calling MoneyException Constructor;
            throw new MoneyException();
        }
    }

}

class MoneyException extends Exception {

    @Override
    public String toString() {
        return "You do not have enough money to buy a yacht";
    }


}