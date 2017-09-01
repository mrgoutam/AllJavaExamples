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
public class DisplayImage extends Applet {

    Image picture;

    @Override
    public void init() {
        picture = getImage(getDocumentBase(), "sonoo.jpg");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }
}
