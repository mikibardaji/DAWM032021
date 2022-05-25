/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Model.Persona;
import Vista.PanelAnyadir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class ControladorPanelAnyadir implements ActionListener {

    PanelAnyadir vista;
    DaoCole modelo;

    public ControladorPanelAnyadir(PanelAnyadir ventana, DaoCole cole) {
        this.vista = ventana;
        this.modelo = cole;
        iniciarListener();
    }

    private void iniciarListener() {
        vista.btReset.addActionListener(this);
        vista.btGuardar.addActionListener(this);
        //ventana.btListar.addActionListener(this);
        //ventana.menuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.btReset == e.getSource()) {
            vista.tfnombre.setText("");
            vista.tfapellidos.setText("");
            vista.tfedad.setText("");
        }

        if (vista.btGuardar == e.getSource()) {
            guardarDatos();
        }
        if (vista.btListar == e.getSource()) {
            listarDatos();
        }
    }

    private void guardarDatos() {
        Persona p = null;
        try {
            String nombre = vista.tfnombre.getText();
            String apellidos = vista.tfapellidos.getText();
            int edad = Integer.valueOf(vista.tfedad.getText());
            String ciclo = (String) vista.combo.getSelectedItem();
            p = new Persona(nombre, apellidos, edad, ciclo);
            imprimirDatosEnPantalla(p);
            modelo.anyadirPersona(p);

        } catch (Exception e) {
            vista.resultado.setText(e.getMessage());
        }

    }

    private void imprimirDatosEnPantalla(Persona p) {
        vista.resultado.setText(p.toString());
    }

    private void listarDatos() {
        vista.resultado.setText(modelo.listadoPersonas());
    }

}
