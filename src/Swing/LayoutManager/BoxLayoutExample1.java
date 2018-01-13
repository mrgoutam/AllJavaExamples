/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.LayoutManager;

import java.awt.Button;
import java.awt.Frame;
import javax.swing.BoxLayout;

/**
 *
 * @author Goutam
 */
public class BoxLayoutExample1 extends Frame {

    Button buttons[];

    public BoxLayoutExample1() {
        buttons = new Button[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
        }

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        BoxLayoutExample1 b = new BoxLayoutExample1();
    }
}
