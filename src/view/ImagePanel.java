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
    private BufferedImage bi2;
    private BufferedImage bi3;
    private BufferedImage bi4;
    private BufferedImage bi5;
    private BufferedImage bi6;
    private BufferedImage bi7;
    private BufferedImage bi8;
    private BufferedImage bi9;
    private BufferedImage bi10;
    private BufferedImage bi11;
    private BufferedImage bi12;
    private BufferedImage bi13;
    private BufferedImage bi14;
    private BufferedImage bi15;
    private BufferedImage bi16;
    private BufferedImage bi17;
    private BufferedImage bi18;
    private BufferedImage bi19;
    private BufferedImage bi20;
    private BufferedImage bi21;
    private BufferedImage bi22;

    public ImagePanel() {

        try {
            bi = ImageIO.read(new File("src/Icons/Paragons_Militia.png"));
            bi2 = ImageIO.read(new File("src/Icons/Paragons_Archer.png"));
            bi3 = ImageIO.read(new File("src/Icons/Paragons_Footsoldier.png"));
            bi4 = ImageIO.read(new File("src/Icons/Paragons_Longbow Archer.png"));
            bi5 = ImageIO.read(new File("src/Icons/Paragons_Knight.png"));
            bi6 = ImageIO.read(new File("src/Icons/Paragons_Crossbowman.png"));
            bi7 = ImageIO.read(new File("src/Icons/Paragons_Cavalry.png"));
            bi8 = ImageIO.read(new File("src/Icons/Paragons_Cuirassier.png"));
            bi9 = ImageIO.read(new File("src/Icons/Paragons_Cannoneer.png"));
            bi10 = ImageIO.read(new File("src/Icons/Orcs_Orkling.png"));
            bi11 = ImageIO.read(new File("src/Icons/Orcs_Orc Hunter.png"));
            bi12 = ImageIO.read(new File("src/Icons/Orcs_Orc Raiders.png"));
            bi13 = ImageIO.read(new File("src/Icons/Orcs_Elite Orc Hunters.png"));
            bi14 = ImageIO.read(new File("src/Icons/Orcs_Orc Veteran.png"));
            bi15 = ImageIO.read(new File("src/Icons/Orcs_Elite Orc Sniper.png"));
            bi16 = ImageIO.read(new File("src/Icons/Orcs_Warg Rider.png"));
            bi17 = ImageIO.read(new File("src/Icons/Orcs_Orc Vanguard.png"));
            bi18 = ImageIO.read(new File("src/Icons/Orcs_Orc Demolisher.png"));
            bi19 = ImageIO.read(new File("src/Icons/Orcs_Bula.png"));
            bi20 = ImageIO.read(new File("src/Icons/Orcs_Aguk.png"));
            bi21 = ImageIO.read(new File("src/Icons/Orcs_Mazoga.png"));
            bi22 = ImageIO.read(new File("src/Icons/Orcs_Durgash.png"));
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

        final JPanel panel2 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi2, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi2.getWidth()/2, bi2.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel3 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi3, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi3.getWidth()/2, bi3.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel4 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi4, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi4.getWidth()/2, bi4.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel5 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi5, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi5.getWidth()/2, bi5.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel6 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi6, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi6.getWidth()/2, bi6.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel7 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi7, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi7.getWidth()/2, bi7.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel8 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi8, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi8.getWidth()/2, bi8.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel9 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi9, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi9.getWidth()/2, bi9.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel10 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi10, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi10.getWidth()/2, bi10.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel11 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi11, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi11.getWidth()/2, bi11.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel12 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi12, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi12.getWidth()/2, bi12.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel13 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi13, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi13.getWidth()/2, bi13.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel14 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi14, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi14.getWidth()/2, bi14.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel15 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi15, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi15.getWidth()/2, bi15.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel16 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi16, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi16.getWidth()/2, bi16.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel17 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi17, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi17.getWidth()/2, bi17.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel18 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi18, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi18.getWidth()/2, bi18.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel19 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi2, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi2.getWidth()/2, bi2.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel20 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi2, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi2.getWidth()/2, bi2.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel21 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi2, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi2.getWidth()/2, bi2.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };
        final JPanel panel22 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics g2 = g.create();
                g2.drawImage(bi2, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();
            }

            @Override
            public Dimension getPreferredSize(){
                return new Dimension(bi2.getWidth()/2, bi2.getHeight()/2);
                //return new Dimension(200, 200);
            }
        };

        add(panel);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);
        add(panel8);
        add(panel9);
        add(panel10);
        add(panel11);
        add(panel12);
        add(panel13);
        add(panel14);
        add(panel15);
        add(panel16);
        add(panel17);
        add(panel18);
        add(panel19);
        add(panel20);
        add(panel21);
        add(panel22);

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
