/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author alumne
 */
public class Alumno extends Persona {
    private int n_expediente;
    private String Ciclo;
    private int curso;

    public Alumno(int n_expediente, String Ciclo, int curso, String nombre, String DNI, String Direccion, String telefono) {
        super(nombre, DNI, Direccion, telefono);
        this.n_expediente = n_expediente;
        this.Ciclo = Ciclo;
        this.curso = curso;
    }
    public int getN_expediente() {
        return n_expediente;
    }

    public void setN_expediente(int n_expediente) {
        this.n_expediente = n_expediente;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    
    @Override
    public void saludarPorLamanyana() {
        super.saludarPorLamanyana(); 
        System.out.println("Soy alumno ZZZZZZZZZZ!!!");
    }

    @Override
    public String toString() {
        return "Alumno{" + "n_expediente=" + n_expediente + ", Ciclo=" + Ciclo + ", curso=" + curso + "nombre=" + this.nombre;
    }


    
    
    
}
