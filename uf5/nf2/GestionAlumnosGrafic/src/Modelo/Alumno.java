/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int edat;
    private String Ciclo;

    public Alumno(String nombre, String apellido, int edat, String Ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edat = edat;
        this.setCiclo(Ciclo);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        if (!Ciclo.equalsIgnoreCase("DAW")
                && !Ciclo.equalsIgnoreCase("DAM")
                && !Ciclo.equalsIgnoreCase("ASIX"))
        {
            this.Ciclo = "DAW";
        }
        else
        {
            this.Ciclo = Ciclo;
        }
        
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
//        if (!(obj instanceof Alumno)) {
//            return false;
//        }
        final Alumno other = (Alumno) obj;
        if (!this.nombre.equalsIgnoreCase(other.nombre)) {
            return false;
        }
        return (this.apellido.equalsIgnoreCase(other.apellido));
    }

    @Override
    public String toString() {
        return "nom=" + nombre + ", cog.=" + apellido + '-';
    }
    
    
}
