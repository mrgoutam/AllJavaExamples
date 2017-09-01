/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JLabel;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Goutam
 */
public class LabelWithActionListener extends Frame implements ActionListener{
        JTextField tf;
        JLabel l;
        JButton b;

    public LabelWithActionListener() {
        
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        
        l = new JLabel();
        l.setBounds(50,100, 250,20);
        
        b = new JButton("Find IP");
        b.setBounds(50,150,95,30);
        b.addActionListener(this);
        
        add(tf);
        add(l);
        add(b);
        
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String []a){
        new LabelWithActionListener();
    }
    
}
