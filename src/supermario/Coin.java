package supermario;
import java.awt.*;
import javax.swing.*;

/**
 * The Coin class creates a JPanel component which stores a graphic 
 * that looks like a Mushroom from Super Mario
 * @author jensbodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * Date Day, Year Initials Completed v#
 */

public class Coin extends JPanel {
    private static final int COIN_HEIGHT = 16;
    private static final int COIN_WIDTH = 13;
    private static final boolean HORIZONTAL = true;
    private static final boolean VERTICAL = false;
    private static final int xPos = 1;
    private int pixelSize = 1;
    
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

    /**
     * Sets default settings for JPanel which stores the coin graphic.  The
     * height and width are calculated based on the constant value for 
     * pixelsize which essentially determines the overall size of the graphic.
     * @param g paint component used to draw graphics
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(pixelSize));
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(
                COIN_WIDTH*pixelSize,(COIN_HEIGHT*pixelSize)+(pixelSize/2)+1));
        this.setSize(getPreferredSize());
        this.revalidate();
        drawCoin(g);
    }
    
    /**
     * Default constructor which creates a coin of pixelSize 1
     */
    public Coin() {

    }
    
    /**
     * Constructor which can take in an int value for pixelSize to create
     * a larger coin
     * @param size int value which will be used to set the constant value for
     * pixelSize
     */
    public Coin(int size) {
        try {
            if (size < 0) {throw new IllegalArgumentException(
                "Coin constructor values must be greater than 0");}
        }
        catch (IllegalArgumentException e) {System.out.println(e);}        
        pixelSize = Math.abs(size);
    }
    
    /**
     * Custom draw method which is used to draw the graphic.  Allows lines
     * to be created based on color, length (based on {@code pixelSize},
     * direction {@code HORIZONTAL / LITERAL}, and its starting x and y
     * positions.
     * @param color takes in Color object to draw a line of that color
     * @param length takes in integer value which then determines the length
     * of the line based on {@code pixelSize}
     * @param type boolean value expects {@code HORIZONTAL} or {@code VERTICAL};
     * {@code HORIZONTAL = true} and {@code VERTICAL = false}
     * @param x starting x position for line
     * @param y starting y position for line
     */
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
    
    /**
     * Plotted points for drawing the coin are based on a pixel map of the 
     * actual drawing.  Dynamically will draw the Coin object based on the
     * {@code pixelSize}
     * @param g2 takes in the graphics object being used to draw the object
     */
    private void drawCoin(Graphics g2) {
        for (int line = xPos; line <= COIN_HEIGHT+xPos; line++) {
            if (line == xPos) {
                drawLine(Black, 3, HORIZONTAL, xPos+5, line);
            }
            if (line == xPos+1) {
                drawLine(Black, 2, HORIZONTAL, xPos+3, line);
                drawLine(White, 2, HORIZONTAL, xPos+5, line);
                drawLine(Black, 3, HORIZONTAL, xPos+7, line);
            }
            if (line == xPos+2) {
                drawLine(Black, 1, HORIZONTAL, xPos+2, line);
                drawLine(White, 1, HORIZONTAL, xPos+3, line);
                drawLine(Black, 2, VERTICAL, xPos+10, line);
                drawLine(Gold, 5, HORIZONTAL, xPos+4, line);
                drawLine(Dark_Gold, 2, VERTICAL, xPos+9, line);
            }
            if (line == xPos+3) {
                drawLine(Black, 2, VERTICAL, xPos+1, line);
                drawLine(White, 1, HORIZONTAL, xPos+2, line);
                drawLine(Gold, 1, HORIZONTAL, xPos+3, line);
                drawLine(Light_Gold, 1, HORIZONTAL, xPos+4, line);
                drawLine(White, 2, HORIZONTAL, xPos+5, line);
                drawLine(Light_Gold, 1, HORIZONTAL, xPos+7, line);
                drawLine(Gold, 1, HORIZONTAL, xPos+8, line);
            }
            if (line == xPos+4) {
                drawLine(Gold, 10, VERTICAL, xPos+2, line);
                drawLine(Light_Gold, 9, VERTICAL, xPos+3, line);
                drawLine(White, 8, VERTICAL, xPos+4, line);
                drawLine(Light_Gold, 6, VERTICAL, xPos+5, line);
                drawLine(Gold, 8, VERTICAL, xPos+6, line);
                drawLine(Black, 8, VERTICAL, xPos+7, line);
                drawLine(Light_Gold, 8, VERTICAL, xPos+8, line);
                drawLine(Gold, 8, VERTICAL, xPos+9, line);
                drawLine(Dark_Gold, 8, VERTICAL, xPos+10, line);
                drawLine(Black, 8, VERTICAL, xPos+11, line);
            }
            if (line == xPos+5) {
                drawLine(Black, 6, VERTICAL, xPos, line);
                drawLine(White, 6, VERTICAL, xPos+1, line);
            }
            if (line == xPos+6) {
                // No lines begin at 7
            }
            if (line == xPos+7) {
                // No lines begin at 8
            }
            if (line == xPos+8) {
                // No lines begin at 9
            }
            if (line == xPos+9) {
                // No lines begin at 10
            }
            if (line == xPos+10) {
                drawLine(Gold, 2, VERTICAL, xPos+5, line);
            }
            if (line == xPos+11) {
                drawLine(Black, 3, VERTICAL, xPos+1, line);
            }
            if (line == xPos+12) {
                drawLine(Light_Gold, 1, HORIZONTAL, xPos+4, line);
                drawLine(Black, 2, HORIZONTAL, xPos+5, line);
                drawLine(Light_Gold, 1, HORIZONTAL, xPos+7, line);
                drawLine(Gold, 1, HORIZONTAL, xPos+8, line);
                drawLine(Dark_Gold, 2, VERTICAL, xPos+9, line);
                drawLine(Black, 2, VERTICAL, xPos+10, line);
            }
            if (line == xPos+13) {
                drawLine(Gold, 5, HORIZONTAL, xPos+3, line);
                drawLine(Dark_Gold, 1, HORIZONTAL, xPos+8, line);
            }
            if (line == xPos+14) {
                drawLine(Black, 2, HORIZONTAL, xPos+2, line);
                drawLine(Dark_Gold, 4, HORIZONTAL, xPos+4, line);
                drawLine(Black, 2, HORIZONTAL, xPos+8, line);
            }
            if (line == xPos+15) {
                drawLine(Black, 4, HORIZONTAL, xPos+4, line);
            }
        } // end for
    } // end drawCoin
 }

