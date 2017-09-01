/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JToggleButton;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 *
 * @author Goutam
 */
public class JToggleButtonExample extends JFrame implements ItemListener {

    public static void main(String[] args) {
        new JToggleButtonExample();
    }
    private JToggleButton button;

    JToggleButtonExample() {
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }

    private void setAction() {
        button.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected()) {
            button.setText("OFF");
        } else {
            button.setText("ON");
        }
    }
}
