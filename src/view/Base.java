package view;

import javax.swing.*;

public class Base extends JFrame{
    private JButton clickMeButton;
    private JPanel panel1;
    private JCheckBox checkBox1;

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        //JButton button = new JButton("Click me");
        this.getContentPane().add(panel1); // Adds Button to content pane of frame
        this.getContentPane().add(clickMeButton);
        this.getContentPane().add(checkBox1);
        this.setVisible(true);
    }
}
