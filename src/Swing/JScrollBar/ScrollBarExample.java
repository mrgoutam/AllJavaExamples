/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JScrollBar;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

/**
 *
 * @author Goutam
 */
public class ScrollBarExample {

    ScrollBarExample() {
        JFrame f = new JFrame("Scrollbar Example");
        JScrollBar s = new JScrollBar();
        s.setBounds(100, 100, 20, 150);
        f.add(s);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new ScrollBarExample();
    }
}
