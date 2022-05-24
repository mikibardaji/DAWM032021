/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnosDAO;
import Vista.PanelDatosAnyadir;
import Vista.VentanaAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumne
 */
public class Controlador implements ActionListener{
    private AlumnosDAO modelo;
    private VentanaAlumnos vista;

    public Controlador(AlumnosDAO modelo, VentanaAlumnos vista) {
        this.modelo = modelo;
        this.vista = vista;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        PanelDatosAnyadir panel = (PanelDatosAnyadir)vista.getContentPane();
        
        if(panel.getBtGuardar() == ae.getSource())
        {
            anyadirAlumno(panel);
            
        }
        if(panel.getBtReset() == ae.getSource())
        {
            resetear(panel);
            
        }        
        //tengo que saber que panel tengo activo
        //puedo utilizar una nueva variable
//        PanelDatosAnyadir anyadir = 
//                (PanelDatosAnyadir) vista.getContentPane();
//        if (anyadir.getBtGuardar() == ae.getSource())
//        {
//            System.out.println("hola");
//        }
        
    }

    private void iniciarListener() {
            //recuperar panel de la ventana JFrame y ponerle el tipo de panel que sea
            PanelDatosAnyadir panel = (PanelDatosAnyadir)vista.getContentPane();
            panel.getBtGuardar().addActionListener(this);
            panel.getBtListar().addActionListener(this);
            panel.getBtReset().addActionListener(this);
        
    }

    private void anyadirAlumno(PanelDatosAnyadir panel) {
        String nom = panel.getTfNombre().getText();
        String cognoms = panel.getTfApellidos().getText();
        int edat = Integer.parseInt(panel.getTfEdad().getText());
        String ciclo = (String) panel.getCmbCiclo().getSelectedItem();
        Alumno add = new Alumno(nom, cognoms, edat, ciclo);
        if (modelo.anyadirAlumno(add))
        {
            panel.getResultado().setText("Alumno guardado");
        }
        else
        {
            panel.getResultado().setText("No guardado");
        }
        
    }

    private void resetear(PanelDatosAnyadir panel) {
         panel.getTfNombre().setText("");
         panel.getTfApellidos().setText("");
        panel.getTfEdad().setText("0");
        panel.getCmbCiclo().setSelectedIndex(0);
    }


    
}
