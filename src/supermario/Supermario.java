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
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(800,600));
        frame.setBackground(Color.blue);
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Coin coin1 = new Coin(2);
        Coin coin2 = new Coin(5);
        Coin coin3 = new Coin(15);
        Mushroom mushroom = new Mushroom(10);

        frame.add(coin1);
        frame.add(coin2);
        frame.add(coin3);
        frame.add(mushroom);
        frame.setVisible(true);
        
    }

}
