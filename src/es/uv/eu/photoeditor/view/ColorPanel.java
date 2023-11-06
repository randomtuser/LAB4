/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Nicholas
 */
public class ColorPanel  extends JPanel {
    JButton j1, j2, j3, j4, j5, j6, j7, j8,j9, j10,j11,j12,j13;


    public ColorPanel(){
        GridLayout gridLayout = new GridLayout(7, 2);
        gridLayout.setHgap(5); // Set horizontal gap (spacing between columns)
        gridLayout.setVgap(5); // Set vertical gap (spacing between rows)
        this.setLayout(gridLayout);

        Border lineBorder = BorderFactory.createLineBorder(Color.lightGray, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
        this.setBorder(compoundBorder);

        JLabel  lineColor = new JLabel("outline color");
        add(lineColor);

        j1 = new JButton("black");
        j1.setBackground(Color.BLACK);
        add(j1);
        j1.setActionCommand("j1");

        j2 = new JButton("cyan");
        j2.setBackground(Color.CYAN);
        add(j2);
        j2.setActionCommand("j2");

        j3 = new JButton("dark gray");
        j3.setBackground(Color.darkGray);
        add(j3);
        j3.setActionCommand("j3");

        j4 = new JButton("gray");
        j4.setBackground(Color.gray);
        add(j4);
        j4.setActionCommand("j4");

        j6 = new JButton("magenta");
        j6.setBackground(Color.magenta);
        add(j6);
        j6.setActionCommand("j6");


        j5 = new JButton("light gray");
        j5.setBackground(Color.lightGray);
        add(j5);
        j5.setActionCommand("j5");

        j7 = new JButton("orange");
        j7.setBackground(Color.orange);
        add(j7);
        j7.setActionCommand("j7");

        j8 = new JButton("rose");
        j8.setBackground(Color.pink);
        add(j8);
        j8.setActionCommand("j8");

        j9 = new JButton("yellow");
        j9.setBackground(Color.yellow);
        add(j9);
        j9.setActionCommand("j9");


        j11 = new JButton("white");
        j11.setBackground(Color.white);
        add(j11);
        j11.setActionCommand("j11");

        j12 = new JButton("red");
        j12.setBackground(Color.red);
        add(j12);
        j12.setActionCommand("j12");

        j13 = new JButton("blue");
        j13.setBackground(Color.blue);
        add(j13);
        j13.setActionCommand("j13");

        j10 = new JButton("green");
        j10.setBackground(Color.green);
        add(j10);
        j10.setActionCommand("j10");
    }

    public void setActionListener(ActionListener listener){
        j1.addActionListener(listener);
        j2.addActionListener(listener);
        j3.addActionListener(listener);
        j4.addActionListener(listener);
        j5.addActionListener(listener);
        j6.addActionListener(listener);
        j7.addActionListener(listener);
        j8.addActionListener(listener);
        j9.addActionListener(listener);
        j10.addActionListener(listener);
        j11.addActionListener(listener);
        j12.addActionListener(listener);
        j13.addActionListener(listener);



    }


}




