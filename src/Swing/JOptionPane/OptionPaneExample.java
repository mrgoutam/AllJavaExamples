/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Goutam
 */
public class OptionPaneExample {

    JFrame f;

    OptionPaneExample() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Hello, Welcome to Javatpoint.");
    }

    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
