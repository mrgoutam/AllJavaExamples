/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Goutam
 */
public class ComboBoxExample2 {

    JFrame f;

    public ComboBoxExample2() {
        f = new JFrame("Combox Example");
        JLabel l = new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400, 100);

        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String languages[] = {"C", "C++", "C#", "Java", "PHP"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);
        f.add(cb);
        f.add(l);
        f.add(b);
        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                l.setText(data);
            }
        });
    }

    public static void main(String a[]) {
        new ComboBoxExample2();
    }
}
