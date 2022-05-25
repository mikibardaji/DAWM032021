/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author rsesen
 */
public class Persona {
    String nombre;
    String apellidos;
    int edad;
    String ciclo;
    
    //Constructor

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad, String ciclo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ciclo = ciclo;
    }

    //setters getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
    //tostring

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", ciclo=" + ciclo + '}';
    }

    /*Seran iguales si tienen mismo nombre y apellidos*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
