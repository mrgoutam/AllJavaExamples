/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JTable;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Goutam
 */
public class TableExample {

    JFrame f;

    TableExample() {
        f = new JFrame();
        String data[][] = {
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"},
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"},
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"},
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"},
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"101", "Sachin", "700000"},
        };
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        
        
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
