/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Goutam
 */
public class SimpleApplet1 extends Applet{
    
    @Override
    public void paint(Graphics g){
        g.drawString("My name is goutam", 50, 50);
    }
}
