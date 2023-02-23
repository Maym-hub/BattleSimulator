package view;

import javax.swing.*;
import javax.swing.text.*;
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
    private JButton clearEnemyTroupsButton;
    private JCheckBox boss1CheckBox;
    private JCheckBox boss2CheckBox;
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
    private JTextField Orkling_textField;
    private JTextField OrcHunter_textField;
    private JTextField OrcRaiders_textField;
    private JTextField EliteOrcHunters_textField;
    private JTextField OrcVeteran_textField;
    private JTextField EliteOrcSniper_textField;
    private JTextField WargRider_textField;
    private JTextField OrcVanguard_textField;
    private JTextField OrcDemolisher_textField;


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

        /*** Die Klasse "NumericDocumentFilter" wird hier verwendet damit nur Zahlen und von 0-100 in den Textfeldern eingegeben werden dürfen **/
        ((AbstractDocument) Militia_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Archer_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Footsoldier_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) LongBowArcher_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Knight_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Crossbowman_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Cavalry_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Cuirassier_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) Cannoneer_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());


        ((AbstractDocument) Orkling_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) OrcHunter_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) OrcRaiders_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) EliteOrcHunters_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) OrcVeteran_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) EliteOrcSniper_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) WargRider_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) OrcVanguard_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());
        ((AbstractDocument) OrcDemolisher_textField.getDocument()).setDocumentFilter(new NumericDocumentFilter());

        /********/


        /*** Die ganzen ActionListeners auf alle Buttons ***/
        clearOurTroupsButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Militia_textField.setText(String.valueOf(0));
                Archer_textField.setText(String.valueOf(0));
                Footsoldier_textField.setText(String.valueOf(0));
                LongBowArcher_textField.setText(String.valueOf(0));
                Knight_textField.setText(String.valueOf(0));
                Crossbowman_textField.setText(String.valueOf(0));
                Cavalry_textField.setText(String.valueOf(0));
                Cuirassier_textField.setText(String.valueOf(0));
                Cannoneer_textField.setText(String.valueOf(0));
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
                int currentValue = Integer.parseInt(Militia_textField.getText() );
                if(currentValue < 100)
                    Militia_textField.setText(String.valueOf(100));
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
                int currentValue = Integer.parseInt(Archer_textField.getText() );
                if(currentValue < 100)
                    Archer_textField.setText(String.valueOf(100));
            }
        });
        a1_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Footsoldier_textField.getText());
                if(currentValue < 100)
                    Footsoldier_textField.setText(Integer.toString(Integer.parseInt(Footsoldier_textField.getText()) + 1));
            }
        });
        a5_Footsoldier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Footsoldier_textField.getText());
                if(currentValue < 100)
                    Footsoldier_textField.setText(Integer.toString(Integer.parseInt(Footsoldier_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Footsoldier_textField.getText() );
                if(currentValue < 100)
                    Footsoldier_textField.setText(String.valueOf(100));
            }
        });
        a1_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(LongBowArcher_textField.getText());
                if(currentValue < 100)
                    LongBowArcher_textField.setText(Integer.toString(Integer.parseInt(LongBowArcher_textField.getText()) + 1));
            }
        });
        a5_LongBowArcher_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(LongBowArcher_textField.getText());
                if(currentValue < 100)
                    LongBowArcher_textField.setText(Integer.toString(Integer.parseInt(LongBowArcher_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(LongBowArcher_textField.getText() );
                if(currentValue < 100)
                    LongBowArcher_textField.setText(String.valueOf(100));
            }
        });
        a1_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Knight_textField.getText());
                if(currentValue < 100)
                    Knight_textField.setText(Integer.toString(Integer.parseInt(Knight_textField.getText()) + 1));
            }
        });
        a5_Knight_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Knight_textField.getText());
                if(currentValue < 100)
                    Knight_textField.setText(Integer.toString(Integer.parseInt(Knight_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Knight_textField.getText() );
                if(currentValue < 100)
                    Knight_textField.setText(String.valueOf(100));
            }
        });
        a1_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Crossbowman_textField.getText());
                if(currentValue < 100)
                    Crossbowman_textField.setText(Integer.toString(Integer.parseInt(Crossbowman_textField.getText()) + 1));
            }
        });
        a5_Crossbowman_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Crossbowman_textField.getText());
                if(currentValue < 100)
                    Crossbowman_textField.setText(Integer.toString(Integer.parseInt(Crossbowman_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Crossbowman_textField.getText() );
                if(currentValue < 100)
                    Crossbowman_textField.setText(String.valueOf(100));
            }
        });
        a1_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cavalry_textField.getText());
                if(currentValue < 100)
                    Cavalry_textField.setText(Integer.toString(Integer.parseInt(Cavalry_textField.getText()) + 1));
            }
        });
        a5_Cavalry_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cavalry_textField.getText());
                if(currentValue < 100)
                    Cavalry_textField.setText(Integer.toString(Integer.parseInt(Cavalry_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Cavalry_textField.getText() );
                if(currentValue < 100)
                    Cavalry_textField.setText(String.valueOf(100));
            }
        });
        a1_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cuirassier_textField.getText());
                if(currentValue < 100)
                    Cuirassier_textField.setText(Integer.toString(Integer.parseInt(Cuirassier_textField.getText()) + 1));
            }
        });
        a5_Cuirassier_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cuirassier_textField.getText());
                if(currentValue < 100)
                    Cuirassier_textField.setText(Integer.toString(Integer.parseInt(Cuirassier_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Cuirassier_textField.getText() );
                if(currentValue < 100)
                    Cuirassier_textField.setText(String.valueOf(100));
            }
        });
        a1_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cannoneer_textField.getText());
                if(currentValue < 100)
                    Cannoneer_textField.setText(Integer.toString(Integer.parseInt(Cannoneer_textField.getText()) + 1));
            }
        });
        a5_Cannoneer_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = Integer.parseInt(Cannoneer_textField.getText());
                if(currentValue < 100)
                    Cannoneer_textField.setText(Integer.toString(Integer.parseInt(Cannoneer_textField.getText()) + 5));
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
                int currentValue = Integer.parseInt(Cannoneer_textField.getText() );
                if(currentValue < 100)
                    Cannoneer_textField.setText(String.valueOf(100));
            }
        });
        clearEnemyTroupsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Orkling_textField.setText(String.valueOf(0));
                OrcHunter_textField.setText(String.valueOf(0));
                OrcRaiders_textField.setText(String.valueOf(0));
                EliteOrcHunters_textField.setText(String.valueOf(0));
                OrcVeteran_textField.setText(String.valueOf(0));
                EliteOrcSniper_textField.setText(String.valueOf(0));
                WargRider_textField.setText(String.valueOf(0));
                OrcVanguard_textField.setText(String.valueOf(0));
                OrcDemolisher_textField.setText(String.valueOf(0));
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
    static class NumericDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.insert(offset, string);
            if (test(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr)
                throws BadLocationException {
            StringBuilder sb = new StringBuilder();
            sb.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            sb.replace(offset, offset + length, string);
            if (test(sb.toString())) {
                super.replace(fb, offset, length, string, attr);
            }
        }
        private boolean test(String text) {
            try {
                int value = Integer.parseInt(text);
                return (value >= 0 && value <= 100);
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }


}
