/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionalumnosgrafic;

import Controlador.Controlador;
import Modelo.AlumnosDAO;
import Vista.VentanaAlumnos;

/**
 *
 * @author alumne
 */
public class GestionAlumnosGrafic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnosDAO modelo = new AlumnosDAO();
        VentanaAlumnos vista = new VentanaAlumnos();
        Controlador cont = new Controlador(modelo, vista);
    }
    
}
