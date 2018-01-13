/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JCheckBox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Goutam
 */
public class CheckBoxExample {

        CheckBoxExample()
        {
            JFrame f = new JFrame("CheckBox Example");
            
            JCheckBox checkBox1 = new JCheckBox("C++",true);
            checkBox1.setBounds(100, 100, 50, 50);
            
            JCheckBox checkBox2 = new JCheckBox("Java", false);
            checkBox2.setBounds(100, 150, 50, 50);
            
            f.add(checkBox1);
            f.add(checkBox2);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  


    public static void main(String args[]) {
        new CheckBoxExample();
    }
}
