/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rsesen
 */
public interface IPersonas {
    void anyadirPersona(Persona p);
    Persona buscarPorNombre(String nombre);
    void eliminarPersona(Persona p);
    void eliminarPersona(String nombre);
    String listadoPersonas();
    
}
