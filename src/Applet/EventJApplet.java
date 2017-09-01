/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Goutam
 */
public class EventJApplet extends JApplet implements ActionListener {

    JButton b;
    JTextField tf;

    @Override
    public void init() {

        tf = new JTextField();
        tf.setBounds(30, 40, 150, 20);

        b = new JButton("Click");
        b.setBounds(80, 150, 70, 40);

        add(b);
        add(tf);
        b.addActionListener(this);

        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }
}
