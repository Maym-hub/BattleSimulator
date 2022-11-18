package view;

import javax.swing.*;

public class Base extends JFrame{
    private JButton calculateButton;
    private JPanel panel1;
    private JTextField a0TextField;
    private JTextField footsoldierTextField;
    private JTextField knightTextField;
    private JTextField longbowArcherTextField;
    private JTextField crossbowmanTextField;
    private JTextField cannoneerTextField;
    private JTextField cuirassierTextField;
    private JTextField militiaTextField;
    private JTextField cavalryTextField;
    private JTextField orclingTextField;
    private JTextField orcRaidersTextField;
    private JTextField orcVeteranTextField;
    private JTextField wargRidersTextField;
    private JTextField orcVanguardTextField;
    private JTextField orcHunterTextField;
    private JTextField eliteOrcHunterTextField;
    private JTextField eliteOrcSniperTextField;
    private JTextField orcDemolisherTextField;
    private JCheckBox generalIncreasedTroupLimitCheckBox;
    private JCheckBox bulaBoss1CheckBox;
    private JCheckBox agukBoss2CheckBox;
    private JCheckBox durgashBoss4CheckBox;
    private JCheckBox mazogaBoss3CheckBox;
    private JButton clearEverythingButton;

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,300);
        //JButton button = new JButton("Click me");
        this.getContentPane().add(panel1); // Adds Button to content pane of frame
        this.setVisible(true);
    }
}
