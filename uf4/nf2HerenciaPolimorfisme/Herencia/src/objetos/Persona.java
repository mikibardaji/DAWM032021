/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author alumne
 */
public class Persona {
    protected String nombre; //protected es privdo pero las clases hijas pueden acceder
    protected String DNI;
    protected String Direccion;
    protected String telefono;

    public Persona(String nombre, String DNI, String Direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void saludarPorLamanyana()
    {
        System.out.println("Soy una persona y saludo Hola que tal, como estas?");
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", Direccion=" + Direccion + ", telefono=" + telefono + '}';
    }
    
    public final void correr()
    {
        System.out.println("Estoy corriendo... ");
    }
    
}
