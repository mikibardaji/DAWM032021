/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class AlumnosDAO implements IAlumnos{
    ArrayList<Alumno> clase;

    public AlumnosDAO() {
        
        clase = new ArrayList<>();
    }
    
    
    
    

    @Override
    public boolean anyadirAlumno(Alumno add) {
        
        if (!clase.contains(add))
        {
            return clase.add(add);
        }
        else
            return false;
       
    }

    @Override
    public boolean BorrarAlumno(Alumno del) {
        return clase.remove(del);        
    }

    @Override
    public ArrayList<Alumno> listar() {
        return clase;
    }

    @Override
    public String listarString() {
        StringBuilder total = new StringBuilder();
        int i=1;
        for (Alumno alumno : clase) {
            total.append(i + "-" + alumno.toString() + "\n");
            i++;
        }
        
        return total.toString();
    }
}
