/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorpulsacionesmvc;

import Controlador.MiControlador;
import Modelo.EnteroDao;
import Vista.VentanaPulsacion;

/**
 *
 * @author alumne
 */
public class ContadorPulsacionesMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiControlador controller = 
                new MiControlador(new VentanaPulsacion(), new EnteroDao(0));
        
    }
    
}
