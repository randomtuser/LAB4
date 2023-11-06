/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.eu.photoeditor.view;

import javax.swing.JMenuBar;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Nicholas
 */
    public class PhotoEditorMenuBar extends JMenuBar{
     private JMenu archive, file2, ayuda;
    private static JMenuItem loadImage, SavePicture, exit, deApp;

    public PhotoEditorMenuBar(){
        archive = new JMenu("archive");
        loadImage = new JMenuItem("Load Image operations.");
        loadImage.setActionCommand("loadImage");
        SavePicture = new JMenuItem("Save Picture");
        SavePicture.setActionCommand("SavePicture");
        exit = new JMenuItem("exit");
        exit.setActionCommand("exit");
        
        archive.add(SavePicture);
        archive.add(loadImage);
        archive.add(exit);
        this.add(archive);

        ayuda = new JMenu("ayuda");
        deApp = new JMenuItem("deApp");
        deApp.setActionCommand("deApp");
        ayuda.add(deApp);
        this.add(ayuda);
    
    }
    
    public void setActionListener(ActionListener listener){
        loadImage.addActionListener(listener);
        SavePicture.addActionListener(listener);
        exit.addActionListener(listener);
        deApp.addActionListener(listener);
    }


}
