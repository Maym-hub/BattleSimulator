package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Base extends JFrame{
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JLabel OurTroups;
    private JLabel EnemieTroups;

    private JCheckBox checkBox2;
    private JButton a1_Militia_Button;
    private JButton a5_Militia_Button;
    private JButton fill_Militia_Button;
    private JButton all_Militia_Button;
    private JTextField textField2;
    private JTextField textField3;
    private JButton clearEnemyTroupsButton;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JTable table1;
    private JLabel label_orc1;
    private JLabel orc2;
    private JLabel orc3;
    private JLabel orc4;
    private JLabel orc5;
    private JLabel orc6;
    private JLabel orc7;
    private JLabel orc8;
    private JLabel orc9;
    private JPanel panel_orc1;
    private JButton clearOurTroupsButton1;
    private JButton a1_Archer_Button;
    private JButton a1_Footsoldier_Button;
    private JButton a5_Archer_Button;
    private JButton fill_Archer_Button;
    private JButton all_Archer_Button;
    private JButton a5_Footsoldier_Button;
    private JButton fill_Footsoldier_Button;
    private JButton all_Footsoldier_Button;
    private JButton a1_LongBowArcher_Button;
    private JButton a5_LongBowArcher_Button;
    private JButton fill_LongBowArcher_Button;
    private JButton all_LongBowArcher_Button;
    private JButton a1_Knight_Button;
    private JButton a5_Knight_Button;
    private JButton fill_Knight_Button;
    private JButton all_Knight_Button;
    private JButton a1_Crossbowman_Button;
    private JButton a5_Crossbowman_Button;
    private JButton fill_Crossbowman_Button;
    private JButton all_Crossbowman_Button;
    private JButton a1_Cavalry_Button;
    private JButton a5_Cavalry_Button;
    private JButton fill_Cavalry_Button;
    private JButton all_Cavalry_Button;
    private JButton a1_Cuirassier_Button;
    private JButton a5_Cuirassier_Button;
    private JButton fill_Cuirassier_Button;
    private JButton all_Cuirassier_Button;
    private JButton a1_Cannoneer_Button;
    private JButton a5_Cannoneer_Button;
    private JButton fill_Cannoneer_Button;
    private JButton all_Cannoneer_Button;
    private JTextField Militia_textField;
    private JTextField Archer_textField;
    private JTextField Footsoldier_textField;
    private JTextField LongBowArcher_textField;
    private JTextField Knight_textField;
    private JTextField Crossbowman_textField;
    private JTextField Cavalry_textField;
    private JTextField Cuirassier_textField;
    private JTextField Cannoneer_textField;


    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,600);
        //JButton button = new JButton("Click me");

        //JPanel panel = new JPanel();
        /*** Test Icon wird erstellt (muss entfernt werden) **/
        ImageIcon image = new ImageIcon("src/Icons/Orcs_Orcling.png");
        JLabel label = new JLabel(image);

        panel_orc1 = new JPanel(/*panel_orc1.getLayout()*/);
        panel_orc1.add(label);


        label.setPreferredSize(new Dimension(150,150));

        /*** Wird MyFrame benötigt? ****/
        //MyFrame frame = new MyFrame();
        //frame.add(panel_orc1);

        /**** (Test) BorderLayout um Tabelle & Bilder sehen zu ***/
        this.getContentPane().add(panel1, BorderLayout.EAST); // Adds Button to content pane of frame
        this.getContentPane().add(panel_orc1/*, BorderLayout.WEST*/);
        this.setVisible(true);

        /** Klasse "ImagePanel" aus Icons Branch wurde eingefügt um Bilder korrekt abzubilden**/
        ImagePanel imagePanel = new ImagePanel();
        this.getContentPane().add(imagePanel, BorderLayout.WEST);

        /**** Test das "Label" durch Bilder zu ersetzen ****/

        panel_orc1.remove(label_orc1);
        panel_orc1.add(imagePanel);
        panel_orc1.validate();
        panel_orc1.repaint();

       // panel_orc1.setPreferredSize(new Dimension(50,50));
        /****/

        /*** Die ganzen ActionListeners auf alle Buttons ***/
        clearOurTroupsButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Militia_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Militia_textField.getText() );
                if(currentValue < 100)
                Militia_textField.setText(Integer.toString(Integer.parseInt(Militia_textField.getText()) + 1));
            }
        });

        a5_Militia_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Militia_textField.getText() );
                if(currentValue < 100)
                    Militia_textField.setText(Integer.toString(Integer.parseInt(Militia_textField.getText()) + 5));
            }
        });
        fill_Militia_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Militia_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Archer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Archer_textField.getText());
                if(currentValue < 100)
                    Archer_textField.setText(Integer.toString(Integer.parseInt(Archer_textField.getText()) + 1));
            }
        });
        a5_Archer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Archer_textField.getText());
                if(currentValue < 100)
                    Archer_textField.setText(Integer.toString(Integer.parseInt(Archer_textField.getText()) + 5));
            }
        });
        fill_Archer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Archer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fill_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        all_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearEnemyTroupsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static class MyFrame extends JFrame {
        public MyFrame() {
            setTitle("Aguk");
            setSize(100,100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            add(panel);
        }
    }
}
