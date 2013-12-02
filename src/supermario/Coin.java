/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package supermario;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

/**
 * 
 * @author jensbodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * Date Day, Year Initials Completed v#
 */

public class Coin extends JPanel {
    private static final int COIN_WIDTH = 40;
    private static final int COIN_HEIGHT = 16;
    private static final boolean HORIZONTAL = true;
    private static final boolean VERTICAL = false;
    private int pixelSize = 16;
    
    //Coin Colors
    private int LIGHT_GOLD = 0xF6E823;
    private int GOLD = 0xFAB511;
    private int DARK_GOLD = 0x845813;
    private int BLACK = 0x1D1D1B;
    private int WHITE = 0xFFFFFF;
    private Color Light_Gold = new Color (LIGHT_GOLD);
    private Color Gold = new Color (GOLD);
    private Color Dark_Gold = new Color (DARK_GOLD);
    private Color Black = new Color (BLACK);
    private Color White = new Color (WHITE);
    private Graphics2D g2;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(White);
        g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(pixelSize));
        drawCoin(g);
    }
    
    private void drawLine(
            Color color, int length, boolean type, int x, int y) {
        g2.setColor(color);
        if (type == HORIZONTAL) {
            g2.drawLine(x*pixelSize, y*pixelSize,
                    ((x+length-1)*pixelSize), y*pixelSize);
        }
        if (type == VERTICAL) {
            g2.drawLine(x*pixelSize, y*pixelSize,
                    x*pixelSize, (y+length-1)*pixelSize);
        }
    }
    
    private void drawCoin(Graphics g2) {
        // color, length, horizontal, startX, startY
        /* 
         *     private Color Light_Gold = new Color (LIGHT_GOLD);
    private Color Gold = new Color (GOLD);
    private Color Dark_Gold = new Color (DARK_GOLD);
    private Color Black = new Color (BLACK);
    private Color White = new Color (WHITE);
         */
        for (int line = 1; line <= COIN_HEIGHT; line++) {
            System.out.println(line);
            if (line == 1) {
                drawLine(Black, 3, HORIZONTAL, 6, line);
            }
            if (line == 2) {
                drawLine(Black, 2, HORIZONTAL, 4, line);
                drawLine(Black, 3, HORIZONTAL, 8, line);
            }
            if (line == 3) {
                drawLine(Black, 1, HORIZONTAL, 3, line);
                drawLine(Black, 2, VERTICAL, 11, line);
                drawLine(Gold, 5, HORIZONTAL, 5, line);
                drawLine(Dark_Gold, 2, VERTICAL, 10, line);
            }
            if (line == 4) {
                drawLine(Black, 2, VERTICAL, 2, line);
                drawLine(Gold, 1, HORIZONTAL, 4, line);
                drawLine(Light_Gold, 1, HORIZONTAL, 5, line);
                drawLine(Light_Gold, 1, HORIZONTAL, 8, line);
                drawLine(Gold, 1, HORIZONTAL, 9, line);
            }
            if (line == 5) {
                drawLine(Gold, 10, VERTICAL, 3, line);
                drawLine(Light_Gold, 9, VERTICAL, 4, line);
                drawLine(Light_Gold, 6, VERTICAL, 6, line);
                drawLine(Gold, 8, VERTICAL, 7, line);
                drawLine(Black, 8, VERTICAL, 8, line);
                drawLine(Light_Gold, 8, VERTICAL, 9, line);
                drawLine(Gold, 8, VERTICAL, 10, line);
                drawLine(Dark_Gold, 8, VERTICAL, 11, line);
                drawLine(Black, 8, VERTICAL, 12, line);
            }
            if (line == 6) {
                drawLine(Black, 6, VERTICAL, 1, line);
            }
            if (line == 7) {
                // No lines begin at 7
            }
            if (line == 8) {
                // No lines begin at 8
            }
            if (line == 9) {
                // No lines begin at 9
            }
            if (line == 10) {
                // No lines begin at 10
            }
            if (line == 11) {
                drawLine(Gold, 2, VERTICAL, 6, line);
            }
            if (line == 12) {
                drawLine(Black, 3, VERTICAL, 2, line);
            }
            if (line == 13) {
                drawLine(Light_Gold, 1, HORIZONTAL, 5, line);
                drawLine(Black, 2, HORIZONTAL, 6, line);
                drawLine(Light_Gold, 1, HORIZONTAL, 8, line);
                drawLine(Gold, 1, HORIZONTAL, 9, line);
                drawLine(Dark_Gold, 2, VERTICAL, 10, line);
                drawLine(Black, 2, VERTICAL, 11, line);
            }
            if (line == 14) {
                drawLine(Gold, 5, HORIZONTAL, 4, line);
                drawLine(Dark_Gold, 1, HORIZONTAL, 9, line);
            }
            if (line == 15) {
                drawLine(Black, 2, HORIZONTAL, 3, line);
                drawLine(Dark_Gold, 4, HORIZONTAL, 5, line);
                drawLine(Black, 2, HORIZONTAL, 9, line);
            }
            if (line == 16) {
                drawLine(Black, 4, HORIZONTAL, 5, line);
            }
        } // end for
    } // end drawCoin
    
    private void drawLight_Gold(Graphics g2) {
        g2.setColor(Light_Gold);
        int i = 4;
        g2.drawLine(5*pixelSize, i*pixelSize, 5*pixelSize, i*pixelSize);
    }
    
    private void drawGold(Graphics g2) {
        g2.setColor(Gold);
        int i = 3;
        g2.drawLine(5*pixelSize, i*pixelSize, 9*pixelSize, i*pixelSize);
        i++;
    }
    
    private void drawDark_Gold(Graphics g2) {
        g2.setColor(Dark_Gold);
        int i = 3;
        g2.drawLine(10*pixelSize, i*pixelSize, 10*pixelSize, (i+=1)*pixelSize);
    }


    
}

