/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Goutam
 */
public class EventApplet extends Applet implements ActionListener {

    Button b;
    TextField tf;

    @Override
    public void init() {
        tf = new TextField();
        tf.setBounds(30, 40, 150, 20);

        b = new Button("Click");
        b.setBounds(80, 150, 60, 50);

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
