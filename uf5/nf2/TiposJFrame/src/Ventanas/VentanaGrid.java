/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;


import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alumne
 */
public class VentanaGrid extends JFrame{

    public VentanaGrid(String title)  {
        super(title);
        setSize(500,500);
        //cerrar la ventana con la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Contenidor del Jfram (es un panel
        Container cp = getContentPane();
        GridLayout gr = new GridLayout(4,3);
        gr.setHgap(5); //distancia en pixeles entre los componentes 
        //que ponga
        gr.setVgap(5);
        
        cp.setLayout(gr); //al panel del jframe va a ser Grid Layout
        //JButton[] botones = new JButton[10];
        for (int i = 1; i < 10; i++) {
            cp.add(new JButton(String.valueOf(i)));
        }
        
        cp.add(new JButton("*"));
        cp.add(new JButton("+"));
        cp.add(new JButton("="));
        
        
        
        
        
    }
    
    
    
}
