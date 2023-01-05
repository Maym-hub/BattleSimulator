package view;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Images extends JPanel{
    private JPanel getContentPane;

    public void Images() {
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("src/backend/data/BattleSimulator_final_Icons/Orcs_Aguk.png");
        JLabel label = new JLabel(image);
        this.add(label);
        label.setPreferredSize(new Dimension(200, 200));
        this.getContentPane.add(panel);
        //Base.MyFrame frame = new Base.MyFrame();
        //frame.add(panel);
    }
}
