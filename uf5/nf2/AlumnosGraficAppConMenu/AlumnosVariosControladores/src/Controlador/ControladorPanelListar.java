/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Vista.PanelListado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class ControladorPanelListar implements ActionListener{
    PanelListado vista;
    DaoCole modelo;
    
    public ControladorPanelListar(PanelListado vista, DaoCole modelo){
        this.vista = vista;
        this.modelo = modelo;
        listarElementos();
        //listar directar
    }
    
    public void listarElementos(){
        vista.textarea.setText("Aqui van todos los elementos \n ...");
        vista.textarea.setText(modelo.listadoPersonas());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
