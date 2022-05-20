/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public interface IAlumnos {
    
    public boolean anyadirAlumno(Alumno add);
    public boolean BorrarAlumno(Alumno del);
    public ArrayList<Alumno> listar();
    public String listarString();
}
