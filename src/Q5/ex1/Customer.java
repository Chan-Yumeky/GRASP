package Q5.ex1;

public class Customer {
    private FruitStore fruitStore;

    public Customer(FruitStore fruitStore) {
        this.fruitStore = fruitStore;
    }

    public void buyFruit(int controlFlag) {
        fruitStore.sellFruit(controlFlag);
    }
}
