/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
Let's see a simple swing example where we are creating one button and adding
it on the JFrame object inside the main() method.
 */
public class FirstSwingExample {

    public static void main(String[] args) {
        //Frame part
        JFrame f = new JFrame();//creating instance of JFrame 
        f.setSize(400, 500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        //end frame

        JButton b = new JButton("click");//creating instance of JButton  
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height  
        f.add(b);//adding button in JFrame  

        
    }
}
