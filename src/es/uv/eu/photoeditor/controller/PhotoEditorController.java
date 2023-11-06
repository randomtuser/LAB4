/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.controller;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

/**
 *
 * @author Nicholas
 */
public class PhotoEditorController {
    PhotoEditorModel m;
    PhotoEditorView v;
    Color colorSelected;
    public PhotoEditorController(PhotoEditorModel model, PhotoEditorView view) {
        this.m = model;
        this.v = view;


        v.setActionListener(new MyActionListener());
        v.setActionListener2(new MyActionListener2());
        v.setChangeListener(new MyChangeListener());
        v.setMouseListener(new MyMouseListener());

    }
    class MyActionListener implements ActionListener{
        ayuda ayudaa;
        @Override
        public void actionPerformed(ActionEvent e) {

            String event = e.getActionCommand();
            switch (event){
                case "SavePicture":
                    SaveImage s = new SaveImage();
                    m.saveImagen(new File(m.getImagenFileName()));
                    s.getFile();
                    v.repaint();
                    break;
                case "deApp":
                    if (ayudaa == null) {  // If the view doesn't exist yet
                        ayudaa = new ayuda();
                    }
                    ayudaa.toFront();  // Bring the window to the front
                    break;
                case "exit":
                    System.exit(0);
                    System.out.println("fasdf");
                    break;
                case "loadImage":
                    LoadImage l = new LoadImage();
                    m.loadImagen( l.getFile());
                    v.repaint();

                    break;
                case "j1":
                    v.changeOutline(Color.BLACK);
                    break;
                case "j2":
                    v.changeOutline(Color.CYAN);
                    break;
                case "j3":
                    v.changeOutline(Color.darkGray);
                    break;
                case "j4":
                    v.changeOutline(Color.gray);
                    break;
                case "j6":
                    v.changeOutline(Color.magenta);
                    break;
                case "j5":
                    v.changeOutline(Color.lightGray);
                    break;
                case "j7":
                    v.changeOutline(Color.orange);
                    break;
                case "j8":
                    v.changeOutline(Color.pink);
                    break;
                case "j9":
                    v.changeOutline(Color.yellow);
                    break;
                case "j10":
                    v.changeOutline(Color.green);
                    break;
                case "j13":
                    v.changeOutline(Color.blue);
                    break;
                case "j11":
                    v.changeOutline(Color.white);
                    break;
                case "j12":
                    v.changeOutline(Color.red);
                    break;



            }



            System.out.println(event);
        }
    }
    class MyActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "j1":
                    v.objectDisplay(Color.BLACK);
                    break;
                case "j2":
                    v.objectDisplay(Color.CYAN);
                    break;
                case "j3":
                    v.objectDisplay(Color.darkGray);
                    break;
                case "j4":
                    v.objectDisplay(Color.gray);
                    break;
                case "j6":
                    v.objectDisplay(Color.magenta);
                    break;
                case "j5":
                    v.objectDisplay(Color.lightGray);
                    break;
                case "j7":
                    v.objectDisplay(Color.orange);
                    break;
                case "j8":
                    v.objectDisplay(Color.pink);
                    break;
                case "j9":
                    v.objectDisplay(Color.yellow);
                    break;
                case "j10":
                    v.objectDisplay(Color.green);
                    break;
                case "j13":
                    v.objectDisplay(Color.blue);
                    break;
                case "j11":
                    v.objectDisplay(Color.white);
                    break;
                case "j12":
                    v.objectDisplay(Color.red);
                    break;



            }



            System.out.println(event);
        }
    }
    class MyChangeListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            int value = source.getValue();
            v.thicknessIntDisplay(String.valueOf(value));
        }
    }
    class  MyMouseListener implements MouseListener{
        Polygon poly  = new Polygon();

        @Override
        public void mouseClicked(MouseEvent e) {


            if (e.getButton() == MouseEvent.BUTTON1) {
                Image img = m.getImagen();
                double scale = Math.min((double) v.imagenPanel.getWidth() / img.getWidth(null),
                        (double) v.imagenPanel.getHeight() / img.getHeight(null));

                // Calculate the new image dimensions
                int scaledWidth = (int) (img.getWidth(null) * scale);
                int scaledHeight = (int) (img.getHeight(null) * scale);

                // Calculate the position to center the image
                int imgX = (v.imagenPanel.getWidth() - scaledWidth) / 2;
                int imgY = (v.imagenPanel.getHeight() - scaledHeight) / 2;

                // Correct the mouse coordinates by the scaling and position of the image
                int correctedX = (int) ((e.getX() - imgX) / scale);
                int correctedY = (int) ((e.getY() - imgY) / scale);


                poly.addPoint(correctedX, correctedY);
                System.out.println(correctedX + " " + correctedY);
                m.pintaPoligono2(poly, v.getWIdth(), v.getEdgesDisplay(), v.GetobjectDisplay());
                v.repaint();


            } else if (e.getButton() == MouseEvent.BUTTON3) {
                m.pintaPoligono(poly, v.getWIdth(), v.getEdgesDisplay()  ,v.GetobjectDisplay());
                v.repaint();
                poly  = new Polygon();
            }


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
