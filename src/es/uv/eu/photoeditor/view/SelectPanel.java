/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

/**
 *
 * @author Nicholas
 */
public class SelectPanel extends JPanel {
    LineWidth slider;
    ColorPanel colorPanel;
    ColorPanelOutline colorPanelOutline;
    public SelectPanel(){
        this.setLayout(new BoxLayout( this,  BoxLayout. Y_AXIS));

        slider = new LineWidth();
        colorPanel = new ColorPanel();
        colorPanelOutline = new ColorPanelOutline();
        this.add(slider);
        this.add(colorPanel);
        this.add(colorPanelOutline);
        Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 10, 15);
        this.setBorder(emptyBorder);


    }

    public  void setActionListener(ActionListener listener) {
        colorPanel.setActionListener(listener);
    }
    public  void setActionListener2(ActionListener listener) {
        colorPanelOutline.setActionListener2(listener);
    }
    public void setChangeListener(ChangeListener listener){
        slider.setChangeListener(listener);
    }
}
