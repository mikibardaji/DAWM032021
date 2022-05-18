/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposjframe;

import Ventanas.VentanaDatosPersonaBorder;
import Ventanas.VentanaDisenyada;
import Ventanas.VentanaFlowLayout;
import Ventanas.VentanaGrid;

/**
 *
 * @author alumne
 */
public class TiposJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaFlowLayout window = new VentanaFlowLayout("PRuebas");
        //VentanaGrid window = new VentanaGrid("PRuebas");
        //VentanaDatosPersonaBorder window = new VentanaDatosPersonaBorder("PRuebas");
        //VentanaDisenyada window = new VentanaDisenyada();
        window.setVisible(true);
    }
    
}
