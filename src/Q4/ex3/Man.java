package Q4.ex3;

public class Man {
    private coffeeMachine coffeeMachine;

    public Man(){
        this.coffeeMachine = new coffeeMachine();
    }

    public void makeCoffee(){
        coffeeMachine.makeCoffee();
    }
}
