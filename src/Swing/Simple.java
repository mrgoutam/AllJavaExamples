/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
We can also write all the codes of creating JFrame, JButton and method call inside the java constructor.
 */
public class Simple {
    JFrame j;
    public Simple() {
        j = new JFrame();
        j.setSize(400, 500);
        j.setLayout(null);
        j.setVisible(true);
        JButton b = new JButton("Click Me");
        b.setBounds(200, 200, 100, 100);
        j.add(b);
    }
    public static void main(String a[]){
        Simple simple = new Simple();
    }
}
