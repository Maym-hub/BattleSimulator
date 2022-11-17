package view;

import javax.swing.*;

public class Base extends JFrame{
    private JButton calculateButton;
    private JPanel panel1;
    private JTextField a0TextField1;
    private JTextField a0TextField2;
    private JTextField a0TextField3;
    private JTextField a0TextField6;
    private JTextField a0TextField7;
    private JTextField a0TextField8;
    private JTextField a0TextField5;
    private JTextField a0TextField;
    private JTextField a0TextField4;
    private JTextField a0TextField9;
    private JTextField a0TextField10;
    private JTextField a0TextField11;
    private JTextField a0TextField12;
    private JTextField a0TextField13;
    private JTextField a0TextField14;
    private JTextField a0TextField15;
    private JTextField a0TextField16;
    private JTextField a0TextField17;
    private JCheckBox generalIncreasedTroupLimitCheckBox;
    private JCheckBox bulaBoss1CheckBox;
    private JCheckBox agukBoss2CheckBox;
    private JCheckBox durgashBoss4CheckBox;
    private JCheckBox mazogaBoss3CheckBox;

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,750);
        //JButton button = new JButton("Click me");
        this.getContentPane().add(panel1); // Adds Button to content pane of frame
        this.setVisible(true);
    }
}
