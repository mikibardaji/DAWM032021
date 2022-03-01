/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author alumne
 */
public class Profesor extends Persona{
    private int cod_prof;
    private String departamento;
    private String modulos;

    public Profesor(int cod_prof, String departamento, String nombre, String DNI, String Direccion, String telefono) {
        super(nombre, DNI, Direccion,telefono); //llama al constructor de Persona con los
        //atributos necesarios para ese constructor
        this.cod_prof = cod_prof;
        this.departamento = departamento;
    }
    
     
    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    @Override
    public void saludarPorLamanyana() {
        System.out.println("Soy Profesor: Hola y adios");
    }

    @Override
    public String toString() {
        String atributos_persona = super.toString();
        return "Profesor{" + "cod_prof=" + cod_prof + ", departamento=" + departamento + ", modulos=" + modulos + "-" + atributos_persona;
    }

 
     
    
    
}
