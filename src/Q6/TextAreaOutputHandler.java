package Q6;

import javax.swing.*;

public class TextAreaOutputHandler implements OutputHandler {
    private JTextArea outputArea;

    public TextAreaOutputHandler(JTextArea outputArea) {
        this.outputArea = outputArea;
    }
    @Override
    public void handleOutput(String message) {
        outputArea.setText(message);
    }
}

