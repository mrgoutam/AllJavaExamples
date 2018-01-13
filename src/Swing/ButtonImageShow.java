/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Goutam
 */
public class ButtonImageShow {

    public ButtonImageShow(int a, int c) {
        JFrame j = new JFrame("Image show example");
        j.setSize(a,c);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b = new JButton(new ImageIcon("D:\\JAVA PROGRAM\\AllJavaExamples\\button.png"));
        b.setBounds(100,100,100,40);
        j.add(b);
    }
    public static void main(String s[]){
        ButtonImageShow buttonImageShow = new ButtonImageShow(500,500);
    }
}
