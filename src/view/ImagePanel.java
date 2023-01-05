package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImagePanel extends JPanel {
        private BufferedImage bi;

    public ImagePanel() {

            try {
                bi = ImageIO.read(new File("src/backend/data/BattleSimulator_final_Icons/Orcs_Bula.png"));
            } catch (IOException ex) {
                Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
            }


            final JPanel panel = new JPanel(){
                @Override
                protected void paintComponent(Graphics g){
                    Graphics g2 = g.create();
                    g2.drawImage(bi, 0, 0, getWidth(), getHeight(), null);
                    g2.dispose();
                }

                @Override
                public Dimension getPreferredSize(){
                    return new Dimension(bi.getWidth()/2, bi.getHeight()/2);
                    //return new Dimension(200, 200);
                }
            };

            add(panel);
        }
/*
        public static void main(String args[]){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ImagePanel imgPanel=new ImagePanel();
                    JOptionPane.showMessageDialog(
                            null, imgPanel, "Image Panel", JOptionPane.PLAIN_MESSAGE);
                }
            });
        }

 */
}
