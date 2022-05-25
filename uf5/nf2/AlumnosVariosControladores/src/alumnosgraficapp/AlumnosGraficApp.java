/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnosgraficapp;

import Controlador.ControladorPanelAnyadir;
import Controlador.ControladorMenu;
import Model.DaoCole;
import Vista.VentanaApp;
import Vista.VentanaGeneral;

/**
 *
 * @author rsesen
 */
public class AlumnosGraficApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaGeneral ventana = new VentanaGeneral();
        ControladorMenu controller = new ControladorMenu(ventana,new DaoCole());
    }
    
}
