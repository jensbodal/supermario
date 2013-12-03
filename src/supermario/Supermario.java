/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package supermario;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jensbodal
 * @version 1.0
 * 
 * Compiler Java 1.7 OS: Windows 7, OSX Hardware: PC
 * 
 * Date Day, Year Initials Completed v#
 */
public class Supermario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setOpaque(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Coin coin = new Coin(10);
        Mushroom mushroom = new Mushroom(10);
        panel.add(coin);
        panel.add(mushroom);
        frame.add(panel);
        frame.setVisible(true);
        
    }

}
