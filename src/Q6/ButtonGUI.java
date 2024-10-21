package Q6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("控制器示例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextArea outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea)); // 添加滚动条
        OutputHandler outputHandler = new TextAreaOutputHandler(outputArea);
        ButtonController controller = new ButtonController(outputHandler);
        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");

        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.buttonAAction();
            }
        });

        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.buttonBAction();
            }
        });

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.buttonCAction();
            }
        });

        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);

        frame.setVisible(true);
    }
}

