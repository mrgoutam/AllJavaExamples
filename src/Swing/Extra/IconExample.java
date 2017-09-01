/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Extra;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Goutam
 */
public class IconExample {

    IconExample() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new IconExample();
    }
}
