package Q2.ex2;

public class coffeMachinePro extends coffeeMachine{
    @Override
    public void makeAmericano(){
        super.makeAmericano();
        System.out.println("Add sugar...");
    }
}
