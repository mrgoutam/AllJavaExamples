/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Goutam
 */
public class ComboBoxExample {

    JFrame f;

    ComboBoxExample() {
        f = new JFrame("ComboBox Example");
        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
