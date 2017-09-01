/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author Goutam
 */
public class ListExample {

    ListExample() {
        JFrame f = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Goutam");
        l1.addElement("Mousam");
        l1.addElement("Abhijit");
        l1.addElement("Diya");
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);
        f.add(list);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new ListExample();
    }
}
