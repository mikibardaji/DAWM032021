/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDAO;

/**
 *
 * @author usuari
 */
public class Persona {
    private final String DNI; //cuando le asigne valor en el constructor no puedo
    //cambiarle el valor nunca mas
    private String nombre;
    private String apellido;
    private int edad;
    private static final int mayoredad=18;

    //constructor 
    public Persona(String DNI, String nombre, String apellido, int edad) {
        this.DNI = DNI; //porque ahora este atributo es final y su valor se debe asignar
        //en el constructor
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.edad = edad;
  //        this.setDNI(DNI);
          this.setNombre(nombre);
          this.setApellido(apellido);
          this.setEdad(edad);
         // mayoredad=18;
    }

    public String getDNI() {
        return DNI;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprime()
    {
        System.out.println("DNI " + this.getDNI() + " nombre" + this.nombre
        + "apellido " + this.getApellido() + " edad " + edad);
    }
    
     public boolean esMayorEdad()
     {
         if(edad>18) //this.edad
         {
             return true;
         }
         else
         {
             return false;
         }
     }
    
     public boolean esJubilado()
     {
         if(edad>65) //this.edad
         {
             return true;
         }
         else
         {
             return false;
         }
        
     }  
    
     public int diferenciaEdad(Persona p) 
     {
         //en cualquier metodo , hay el this, que es el objeto que ha llamado
         //a este metodo
         int diferencia=0;
         
         diferencia = edad - p.getEdad();
         if (diferencia < 0)
         {
             diferencia = diferencia *(-1);
         }
         //mirarme por que me deja poner p.edad
         return diferencia;
     }
    
    
}
