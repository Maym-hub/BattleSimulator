package view;

import javax.swing.*;
import java.awt.*;

public class Base extends JFrame{
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JLabel OurTroups;
    private JLabel EnemieTroups;

    private JCheckBox checkBox2;
    private JButton a1Button;
    private JButton a5Button;
    private JButton fillButton;
    private JButton allButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton clearButton;
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

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,600);
        //JButton button = new JButton("Click me");

        //JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("src/Icons/Orcs_Orcling.png");
        JLabel label = new JLabel(image);
        panel_orc1 = new JPanel(panel_orc1.getLayout());
        //panel_orc1.add(label);
        // Klasse aus Icons Branch einfügen
        label.setPreferredSize(new Dimension(200,200));

        MyFrame frame = new MyFrame();
        frame.add(panel_orc1);

        this.getContentPane().add(panel1); // Adds Button to content pane of frame
        this.getContentPane().add(panel_orc1, BorderLayout.WEST);
        this.setVisible(true);


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
