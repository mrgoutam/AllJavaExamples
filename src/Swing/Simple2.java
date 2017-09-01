/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 We can also inherit the JFrame class, so there is no need to create the instance of JFrame class explicitly.
 */
public class Simple2 extends JFrame {

    JFrame j;

    Simple2() {
        JButton b = new JButton("click");//create button  
        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame  
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Simple2();
    }

}
