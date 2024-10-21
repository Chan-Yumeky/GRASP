package Q6;

public class ButtonController {
    private ButtonAction lastAction = ButtonAction.ACTION_A; // 默认按下 A
    private final OutputHandler outputHandler;

    public ButtonController(OutputHandler outputHandler) {
        this.outputHandler = outputHandler;
    }

    public void buttonAAction() {
        switch (lastAction) {
            case ACTION_B:
                outputHandler.handleOutput("执行B功能！");
                break;
            case ACTION_C:
                outputHandler.handleOutput("执行C功能！");
                break;
            default:
                outputHandler.handleOutput("Hello World!");
        }
        lastAction = ButtonAction.ACTION_A;  // 更新最近的操作为 A
    }
    public void buttonBAction() {
        lastAction = ButtonAction.ACTION_B;  // 更新最近的操作为 B
    }
    public void buttonCAction() {
        lastAction = ButtonAction.ACTION_C;  // 更新最近的操作为 C
    }
}

