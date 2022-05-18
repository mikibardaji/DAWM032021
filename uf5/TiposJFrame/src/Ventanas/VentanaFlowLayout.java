/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class VentanaFlowLayout extends JFrame
{

    public VentanaFlowLayout(String title){
        super(title); //es llamar al codigo del constructor padre (Jframe)
        setParameters();
    }

    private void setParameters() {
            //fico tamany finestra
            setSize(500,400); //this.
            //cerrar la ventana con la X
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Contenidor del Jfram (es un panel
            Container cp = getContentPane();
            cp.setLayout(new FlowLayout());
            JLabel etiqueta_nombre = new JLabel("Nombre:");
            //20 son los caracteres que permitira el cuadro texto
            JTextField cuadro_nombre = new JTextField(20);
            JButton boton = new JButton("Saludar");
            ActionListener al = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String nom = cuadro_nombre.getText();//recupero
                    //el texto del cuadro y lo vuelco en un string
                    String saludo = "Hola " + nom + "!";
                    cuadro_nombre.setText(saludo);
                }
            };
            
            ActionListener al2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String nom = cuadro_nombre.getText();//recupero
                    //el texto del cuadro y lo vuelco en un string
                    String saludo = "Adios " + nom + "!";
                    cuadro_nombre.setText(saludo);
                }
            };
            
            
            boton.addActionListener(al);
            
            JButton boton2 = new JButton("Nada");
            boton2.addActionListener(al2);
            
            cp.add(etiqueta_nombre);
            cp.add(cuadro_nombre);
            cp.add(boton);
            cp.add(boton2);
            
            
            
            
            
//            JLabel etiqueta_nombre2 = new JLabel("Edat:");
//            JTextField cuadro_nombre2 = new JTextField(5);
//            cp.add(etiqueta_nombre2);
//            cp.add(cuadro_nombre2);
            
    }
    
    
    
}
