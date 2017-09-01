/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Goutam
 */
public class ScrollPaneDemo extends JFrame {

    public ScrollPaneDemo() {
        super("ScrollPane Demo");
        ImageIcon img = new ImageIcon("child.png");

        JScrollPane png = new JScrollPane(new JLabel(img));

        getContentPane().add(png);
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}
