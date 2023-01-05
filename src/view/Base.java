package view;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class Base extends JFrame{
    private JButton clickMeButton;
    private JPanel panel1;
    private JCheckBox checkBox1;

    private JPanel panel;
    private JPanel icon;

    public Base(String name) {
        setName(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        JPanel panel = new JPanel(new BorderLayout());
        ImageIcon image = new ImageIcon("src/backend/data/BattleSimulator_final_Icons/Orcs_Aguk.png");
        JLabel label = new JLabel(image);
        panel.add(label);
        label.setPreferredSize(new Dimension(200, 200));
        MyFrame frame = new MyFrame();
        frame.add(panel);
        //this.getContentPane().add(panel);

        //panel1.add(panel);
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.setVisible(true);

    }
    public static class MyFrame extends JFrame {
        public MyFrame() {
            // Set the title, size, and default close operation of the frame
            setTitle("My Frame");
            setSize(100, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create and add a panel to the frame
            JPanel panel = new JPanel();
            add(panel);
        }
    }
/*
    public static class Images {
        public Images() {
            JPanel panel = new JPanel();
            ImageIcon image = new ImageIcon("src/backend/data/BattleSimulator_final_Icons/Orcs_Aguk.png");
            JLabel label = new JLabel(image);
            panel.add(label);
            label.setPreferredSize(new Dimension(200, 200));
            MyFrame frame = new MyFrame();
            frame.add(panel);

            //Images.getContentPane().add(panel);
        }
    }
*/

}
