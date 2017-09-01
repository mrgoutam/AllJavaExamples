/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Goutam
 */
public class ToolTipExample {

    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");
        //Creating PasswordField and label  
        JPasswordField value = new JPasswordField();
        value.setBounds(100, 100, 100, 30);
        value.setToolTipText("Enter your Password");
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        //Adding components to frame  
        f.add(value);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
