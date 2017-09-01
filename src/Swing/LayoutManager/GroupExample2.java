/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.LayoutManager;

import java.awt.Container;
import static java.awt.GridBagConstraints.BASELINE;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.SwingConstants.LEADING;
import static javax.swing.SwingConstants.TRAILING;

/**
 *
 * @author Goutam
 */
public class GroupExample2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myPanel = frame.getContentPane();

        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);

        JButton b1 = new JButton("Button One");
        JButton b2 = new JButton("Button Two");
        JButton b3 = new JButton("Button Three");

//        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
//                .addGroup(groupLayout.createParallelGroup(LEADING).addComponent(b1).addComponent(b3))
//                .addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(b2)));
//
//        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
//                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(b1).addComponent(b2))
//                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(b3)));

        frame.pack();
        frame.setVisible(true);
    }
}
