/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;

/**
 *
 * @author Nicholas
 */
public class ImagenPanel  extends JPanel {
    PhotoEditorModel m;
    public  ImagenPanel(PhotoEditorModel m){
        this.m = m;
        JPanel frame = new JPanel();
        Border lineBorder = BorderFactory.createLineBorder(Color.lightGray, 2);
        this.setBorder(lineBorder);

        this.add(frame);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image img = m.getImagen();


        double scale = Math.min((double) getWidth() / img.getWidth(null),
                (double) getHeight() / img.getHeight(null));

        // Calculate the new image dimensions
        int scaledWidth = (int) (img.getWidth(null) * scale);
        int scaledHeight = (int) (img.getHeight(null) * scale);

        // Calculate the position to center the image
        int x = (getWidth() - scaledWidth) / 2;
        int y = (getHeight() - scaledHeight) / 2;

        // Draw the scaled image
        g.drawImage(img, x, y, scaledWidth, scaledHeight, this);





    }
    public void setMouseListener(MouseListener listener){
        this.addMouseListener(listener);
    }

}
