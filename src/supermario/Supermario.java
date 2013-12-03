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
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(240,100);
        //frame.setBackground(Color.blue);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin3 = new Coin(3);
        Mushroom mushroom1 = new Mushroom(1);
        Mushroom mushroom2 = new Mushroom(2);
        Mushroom mushroom3 = new Mushroom(3);

        frame.add(coin1);
        frame.add(coin2);
        frame.add(coin3);
        frame.add(mushroom1);
        frame.add(mushroom2);
        frame.add(mushroom3);
        frame.setVisible(true);
    }

}
