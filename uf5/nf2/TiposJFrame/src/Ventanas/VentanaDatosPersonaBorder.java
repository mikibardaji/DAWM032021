/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class VentanaDatosPersonaBorder extends JFrame{

    public VentanaDatosPersonaBorder(String title)  {
        super(title);
        setSize(300,200);
        //cerrar la ventana con la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panen para poner una fecha
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2)); //componentes que añado al panel
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2)); //componentes que añado al panel
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        
        
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(3,2));
        panelDatos.add(new JLabel("Nombre: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha: "));
        panelDatos.add(panelFecha);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Borrar"));
        
        Container cp = getContentPane();
        //borderLayout
        cp.add(panelDatos,BorderLayout.CENTER);
        cp.add(panelBotones,BorderLayout.SOUTH);
        
        
        
        
        
        
    }

    
    
}
