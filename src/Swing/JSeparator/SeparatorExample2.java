/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JSeparator;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

/**
 *
 * @author Goutam
 */
public class SeparatorExample2 {

    public static void main(String args[]) {
        JFrame f = new JFrame("Separator Example");
        f.setLayout(new GridLayout(0, 1));
        JLabel l1 = new JLabel("Above Separator");
        f.add(l1);
        JSeparator sep = new JSeparator();
        f.add(sep);
        JLabel l2 = new JLabel("Below Separator");
        f.add(l2);
        f.setSize(400, 100);
        f.setVisible(true);
    }
}
