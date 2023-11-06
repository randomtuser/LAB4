/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *
 * @author Nicholas
 */
public class LineWidth  extends JPanel {
    JSlider slider ;
    public LineWidth(){
        slider = new JSlider(JSlider.HORIZONTAL,0,10,5);

        Border lineBorder = BorderFactory.createLineBorder(Color.lightGray, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
        this.setBorder(compoundBorder);

        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        this.add(slider);
    }
    public void setChangeListener(ChangeListener listener){
        slider.addChangeListener(listener);
    }

}
