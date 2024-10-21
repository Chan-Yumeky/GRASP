package Q5.ex1;

public class FruitStore {
    public void sellFruit(int controlFlag) {
        if (controlFlag == 1) {
            System.out.println("Selling apples...");
        } else if (controlFlag == 2) {
            System.out.println("Selling bananas...");
        } else if (controlFlag == 3) {
            System.out.println("Selling oranges...");
        } else {
            System.out.println("Being Sold out...");
        }
    }
}
