package supermario;
import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author jensbodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * Date Day, Year Initials Completed v#
 */

public class Mushroom extends JPanel {


    private static final int MUSHROOM_HEIGHT = 17;
    private static final int MUSHROOM_WIDTH = 17;
    private static final boolean HORIZONTAL = true;
    private static final boolean VERTICAL = false;
    private int pixelSize = 1;
    private int xPos = 1;
    
    //Mushroom Colors
    private int BLACK = 0x000000;
    private int GREEN = 0x21AA52;
    private int WHITE = 0xFFFFFF;
    private Color Black = new Color (BLACK);
    private Color Green = new Color (GREEN);
    private Color White = new Color (WHITE);
    private Graphics2D g2;

    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setOpaque(false);        
        setPreferredSize(new Dimension(MUSHROOM_WIDTH*pixelSize,
                (MUSHROOM_HEIGHT*pixelSize)+(pixelSize/2)));
        setSize(getPreferredSize());
        g2 = (Graphics2D) g;        
        g2.setStroke(new BasicStroke(pixelSize));
        drawMushroom(g);
    }
    
    public Mushroom() {
        
    }
    
    public Mushroom(int size) {
        try {
            if (size < 0) {throw new IllegalArgumentException(
                "Mushroom constructor values must be greater than 0");}
        }
        catch (IllegalArgumentException e) {System.out.println(e);}        
        pixelSize = Math.abs(size);
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
    
    private void drawMushroom(Graphics g2) {
        for (int line = xPos; line <= MUSHROOM_HEIGHT+xPos; line++) {
            if (line == xPos) {
                drawLine(Black, 6, HORIZONTAL, xPos+5, line);
            }
            if (line == xPos+1) {
                drawLine(Black, 3, HORIZONTAL, xPos+3, line);
                drawLine(White, 1, HORIZONTAL, xPos+6, line);
                drawLine(Green, 2, HORIZONTAL, xPos+7, line);
                drawLine(White, 1, HORIZONTAL, xPos+9, line);
                drawLine(Black, 3, HORIZONTAL, xPos+10, line);
            }
            if (line == xPos+2) {
                drawLine(Black, 2, HORIZONTAL, xPos+2, line);
                drawLine(White, 3, HORIZONTAL, xPos+4, line);
                drawLine(Green, 2, HORIZONTAL, xPos+7, line);
                drawLine(White, 3, HORIZONTAL, xPos+9, line);
                drawLine(Black, 2, HORIZONTAL, xPos+12, line);
            }
            if (line == xPos+3) {
                drawLine(Black, 2, HORIZONTAL, xPos+1, line);
                drawLine(Green, 1, HORIZONTAL, xPos+3, line);
                drawLine(White, 2, HORIZONTAL, xPos+4, line);
                drawLine(Green, 4, HORIZONTAL, xPos+6, line);
                drawLine(White, 2, HORIZONTAL, xPos+10, line);
                drawLine(Green, 1, HORIZONTAL, xPos+12, line);
                drawLine(Black, 2, HORIZONTAL, xPos+13, line);
            }
            if (line == xPos+4) {
                drawLine(Black, 2, VERTICAL, xPos+1, line);
                drawLine(White, 1, HORIZONTAL, xPos+2, line);
                drawLine(Green, 10, HORIZONTAL, xPos+3, line);
                drawLine(White, 1, HORIZONTAL, xPos+13, line);
                drawLine(Black, 2, VERTICAL, xPos+14, line);
            }
            if (line == xPos+5) {
                drawLine(Black, 8, VERTICAL, xPos, line);
                drawLine(White, 2, HORIZONTAL, xPos+2, line);
                drawLine(Green, 2, HORIZONTAL, xPos+4, line);
                drawLine(White, 4, HORIZONTAL, xPos+6, line);
                drawLine(Green, 2, HORIZONTAL, xPos+10, line);
                drawLine(White, 2, HORIZONTAL, xPos+12, line);
                drawLine(Black, 8, VERTICAL, xPos+15, line);
            }
            if (line == xPos+6) {
                drawLine(White, 3, HORIZONTAL, xPos+1, line);
                drawLine(Green, 5, VERTICAL, xPos+4, line);
                drawLine(White, 6, HORIZONTAL, xPos+5, line);
                drawLine(Green, 5, VERTICAL, xPos+11, line);
                drawLine(White, 3, HORIZONTAL, xPos+12, line);
            }
            if (line == xPos+7 || line == xPos+8) {
                drawLine(White, 3, HORIZONTAL, xPos+1, line);
                drawLine(White, 6, HORIZONTAL, xPos+5, line);
                drawLine(White, 3, HORIZONTAL, xPos+12, line);
            }
            if (line == xPos+9) {
                drawLine(White, 2, HORIZONTAL, xPos+1, line);
                drawLine(Green, 1, HORIZONTAL, xPos+3, line);
                drawLine(White, 6, HORIZONTAL, xPos+5, line);
                drawLine(Green, 1, HORIZONTAL, xPos+12, line);
                drawLine(White, 2, HORIZONTAL, xPos+13, line);
            }
            if (line == xPos+10) {
                drawLine(Green, 5, HORIZONTAL, xPos+1, line);
                drawLine(White, 4, HORIZONTAL, xPos+6, line);
                drawLine(Green, 5, HORIZONTAL, xPos+10, line);
            }
            if (line == xPos+11) {
                drawLine(Green, 2, HORIZONTAL, xPos+1, line);
                drawLine(Black, 10, HORIZONTAL, xPos+3, line);
                drawLine(Green, 2, HORIZONTAL, xPos+13, line);
            }
            if (line == xPos+12) {
                drawLine(Black, 3, HORIZONTAL, xPos+1, line);
                drawLine(White, 2, HORIZONTAL, xPos+4, line);
                drawLine(Black, 2, VERTICAL, xPos+6, line);
                drawLine(White, 2, HORIZONTAL, xPos+7, line);
                drawLine(Black, 2, VERTICAL, xPos+9, line);
                drawLine(White, 2, HORIZONTAL, xPos+10, line);
                drawLine(Black, 3, HORIZONTAL, xPos+12, line);
            }
            if (line == xPos+13) {
                drawLine(Black, 2, HORIZONTAL, xPos+1, line);
                drawLine(White, 3, HORIZONTAL, xPos+3, line);
                drawLine(White, 2, HORIZONTAL, xPos+7, line);
                drawLine(White, 3, HORIZONTAL, xPos+10, line);
                drawLine(Black, 2, HORIZONTAL, xPos+13, line);
            }
            if (line == xPos+14) {
                drawLine(Black, 2, VERTICAL, xPos+2, line);
                drawLine(White, 10, HORIZONTAL, xPos+3, line);
                drawLine(Black, 2, VERTICAL, xPos+13, line);
            }
            if (line == xPos+15) {
                drawLine(Black, 1, HORIZONTAL, xPos+3, line);
                drawLine(White, 8, HORIZONTAL, xPos+4, line);
                drawLine(Black, 1, HORIZONTAL, xPos+12, line);
            }
            if (line == xPos+16) {
                drawLine(Black, 10, HORIZONTAL, xPos+3, line);
            }
        } // end for
    } // end drawMushroom
 }



