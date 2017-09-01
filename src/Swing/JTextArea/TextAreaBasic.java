/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JTextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Goutam
 */
public class TextAreaBasic {

    public TextAreaBasic() {
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("Welcome to Swing");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String a[]){
         new TextAreaBasic();
    }
}
