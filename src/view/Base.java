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
        this.getContentPane().add(panel1);

        this.setVisible(true);
    }
}
