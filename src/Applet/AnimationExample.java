/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Goutam
 */
public class AnimationExample extends Applet {

    Image picture;

    @Override
    public void init() {
        picture = getImage(getDocumentBase(), "bike_1.gif");
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 500; i++) {
            g.drawImage(picture, i, 30, this);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
