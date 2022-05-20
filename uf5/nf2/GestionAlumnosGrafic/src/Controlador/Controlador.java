/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlumnosDAO;
import Vista.VentanaAlumnos;

/**
 *
 * @author alumne
 */
public class Controlador {
    private AlumnosDAO modelo;
    private VentanaAlumnos vista;

    public Controlador(AlumnosDAO modelo, VentanaAlumnos vista) {
        this.modelo = modelo;
        this.vista = vista;
        //iniciarListener
    }
    
    
}
