package Q3.ex2;

public class Father {
    public static int secretStash = 35000;

    public void increment() {
        secretStash += 5000;  // 增加静态变量
        System.out.println("私房钱增加了...");
    }
}
