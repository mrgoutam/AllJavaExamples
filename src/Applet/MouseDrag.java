/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Goutam
 */
public class MouseDrag extends Applet implements MouseMotionListener {

    @Override
    public void init() {
        addMouseMotionListener(this);
        setBackground(Color.red);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 5, 5);
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

}
