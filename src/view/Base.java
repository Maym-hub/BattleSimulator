package view;

import javax.swing.*;

public class Base extends JFrame{
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JLabel OurTroups;
    private JLabel EnemieTroups;

    private JTable tableEnemieTroups;
    private JTable tableResults;
    private JCheckBox checkBox2;
    private JButton a1Button;
    private JButton a5Button;
    private JButton fillButton;
    private JButton allButton;
    private JTextField textField1;

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        //JButton button = new JButton("Click me");
        this.getContentPane().add(panel1); // Adds Button to content pane of frame
        this.setVisible(true);
    }
}
