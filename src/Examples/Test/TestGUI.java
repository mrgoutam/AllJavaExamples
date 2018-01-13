/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples.Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Goutam
 */
public class TestGUI {
    
    public static void main(String[] args){
        TestGUI testGUI = new TestGUI();
        testGUI.designGUI();
    }
    
    public void designGUI(){
        System.out.println("Design started");
        JFrame jFrame = new JFrame("Test GUI");
        
        
        JLabel time_label = new JLabel();
        time_label.setBounds(100, 30, 70, 30);
        time_label.setText("Time(min):");
        jFrame.add(time_label);
        
        JTextField time_field = new JTextField();
        time_field.setBounds(180,30,70,30);
        jFrame.add(time_field);
        
        JButton set_button = new JButton();
        set_button.setBounds(270,30,100,30);
        set_button.setText("SET");
        jFrame.add(set_button);
        
        JButton start_button = new JButton();
        start_button.setBounds(100,70,100,30);
        start_button.setText("START");
        jFrame.add(start_button);
        
        JButton stop_button = new JButton();
        stop_button.setBounds(270,70,100,30);
        stop_button.setText("STOP");
        jFrame.add(stop_button);
        
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        set_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Timer set");
            }
        });
        
        start_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Timer Started");
            }
        });
        
        stop_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Timer Stoped");
            }
        });
    }
}
