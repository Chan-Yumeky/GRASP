package Q1.Close_Usage;

public class WebApplication {
    public void useWeb(Database database){
        System.out.println("You are registering...");
        database.dataStore();
        System.out.println("You are logging in...");
        database.logInCheck();
        System.out.println("Successfully logging...");
    }
}
