/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import objetos.Alumno;
import objetos.Persona;
import objetos.Profesor;

/**
 *
 * @author alumne
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Paz", "1", "calle1", "tel1");
        Alumno al = new Alumno(1, "DAW", 1, "Aran", "DN1", "Direccion1", "tel2");
        Profesor p = new Profesor(1, "Informatica", "Paz", "1", "calle1", "tel1");
        
      //  p.nombre="Miquel Angel";
      //  p.cod_prof=1;
        System.out.println(p.getDepartamento());
        System.out.println(p.getNombre());
        p1.saludarPorLamanyana();
        al.saludarPorLamanyana();
        p.saludarPorLamanyana();
        System.out.println("alumno.tostring " + al.toString());
        System.out.println("persona.tostring " + p1.toString());
        System.out.println("profesor.tostring "  + p.toString());
    }
    
}
