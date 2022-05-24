/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author alumne
 */
public class VentanaAlumnos extends JFrame{

    public VentanaAlumnos()  {
        //configurant finestra principal
        super("Gestió Alumnes");
        setSize(600,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //que no se puede redimensionar
        //añadir panel con los componenentes
        setContentPane(new PanelDatosAnyadir());
        setVisible(true);
       
        
    }
    
    
    
}
