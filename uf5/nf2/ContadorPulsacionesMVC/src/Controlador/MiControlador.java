/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EnteroDao;
import Vista.VentanaPulsacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumne
 */
public class MiControlador implements ActionListener{
    private VentanaPulsacion vista;
    private EnteroDao modelo;

    public MiControlador(VentanaPulsacion vista, EnteroDao modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (vista.getBtnAumentar() == ae.getSource())
        {
            aumentarUno();
        }
        else if (vista.getBtnReset()== ae.getSource())
        {
            resetear();
        }
        //actualizo el numero en pantalla
        vista.getLblNum().setText(String.valueOf(modelo.getNum()));
    }

    private void aumentarUno() {
        modelo.aumentarEnUno();
    }

    private void resetear() {
        modelo.setNum(0);
    }

    /**
     * a todos los COMPONENTES de la pantalla
     * les asociare el mismo listener que en nuestro caso
     * es la clase Micontrolador
     */
    private void iniciarListener() {
        vista.getBtnAumentar().addActionListener(this);
        vista.getBtnReset().addActionListener(this);
    }
   
    
    
    
}
