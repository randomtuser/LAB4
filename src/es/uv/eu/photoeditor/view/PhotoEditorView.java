/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import com.sun.jdi.VirtualMachineManager;
import es.uv.eu.photoeditor.model.PhotoEditorModel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 *
 * @author Nicholas
 */
public class PhotoEditorView extends JFrame {
    SelectPanel selectPanel;
    StatusPanel statusPanel;
    public ImagenPanel imagenPanel;
    PhotoEditorMenuBar bar;
    PhotoEditorModel m;
    public PhotoEditorView(PhotoEditorModel model)  {
        this.m = model;
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Ensure the application doesn't close

        bar = new PhotoEditorMenuBar();
        selectPanel = new SelectPanel();
        statusPanel = new StatusPanel();
        imagenPanel = new ImagenPanel(m);



        this.setJMenuBar(bar);

        main.add(selectPanel, BorderLayout.WEST);
        main.add(statusPanel, BorderLayout.SOUTH);
        main.add(imagenPanel, BorderLayout.CENTER);





        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        main.setBorder(emptyBorder);
        this.add(main);
        this.setSize(1000,1000);
        this.setVisible(true);



    }
    public void updateImage() {
        imagenPanel.repaint();
    }

    public void setActionListener(ActionListener listener){
        selectPanel.setActionListener(listener);
        bar.setActionListener(listener);


    }
    public void setActionListener2(ActionListener listener){
        selectPanel.setActionListener2(listener);

    }
    public void changeOutline(Color color){
        statusPanel.changeOutline(color);
    }
    public void objectDisplay(Color color){
        statusPanel.objectDisplay(color);
    }
    public void setChangeListener(ChangeListener listener){
        selectPanel.setChangeListener(listener);
    }
    public void thicknessIntDisplay(String i ){
        statusPanel.thicknessIntDisplay(i);
    }





    public int getWIdth(){
        return (statusPanel.getWIdth());
    }
    public Color getEdgesDisplay(){
        return statusPanel.getEdgesDisplay();
    }
    public Color GetobjectDisplay(){
        return statusPanel.GetobjectDisplay();
    }

    public void setMouseListener(MouseListener listener){
        imagenPanel.addMouseListener(listener);
    }


}
