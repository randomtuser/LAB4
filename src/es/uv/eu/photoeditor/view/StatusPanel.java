/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 *
 * @author Nicholas
 */
public class StatusPanel extends JPanel{
    JTextField thicknessInt;
    JTextField edgesDisplay;
    JTextField objectDisplay;

    Color ColoredgesDisplay = Color.white;
    Color ColorobjectDisplay = Color.white;;
    public StatusPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        JLabel thickness = new JLabel("thickness:");
        thicknessInt = new JTextField("5");
        thicknessInt.setEditable(!true);

        JLabel edgesColor = new JLabel("color of edges:");
        edgesDisplay = new JTextField("");
        edgesDisplay.setEditable(!true);

        JLabel objectColor = new JLabel("color of object:");
        objectDisplay = new JTextField("");

        objectDisplay.setEditable(!true);


        this.add(thickness);
        this.add(thicknessInt);

        this.add(edgesColor);
        this.add(edgesDisplay);

        this.add(objectColor);
        this.add(objectDisplay);

        Border lineBorder = BorderFactory.createLineBorder(Color.lightGray, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
        this.setBorder(compoundBorder);

    }

    public void changeOutline(Color color){
        edgesDisplay.setBackground(color);
        ColoredgesDisplay = color;
    }
    public void objectDisplay(Color color){
        objectDisplay.setBackground(color);
        ColorobjectDisplay = color;
    }
    public void thicknessIntDisplay(String i ){
        thicknessInt.setText(i);
    }

    public int getWIdth(){
        return Integer.parseInt(thicknessInt.getText());
    }
    public Color getEdgesDisplay(){
        return ColoredgesDisplay;
    }
    public Color GetobjectDisplay(){
        return ColorobjectDisplay;
    }

}

