/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author alumne
 */
public class Madre {
    private String nombre;
    public void llamame()
    {
        System.out.println("Soy la clase madre");
    }
    
    
    public static Madre madreJosefa()
    {
        Madre nueva = new Madre();
        nueva.nombre = "Josefa";
        return nueva;
    }
}
