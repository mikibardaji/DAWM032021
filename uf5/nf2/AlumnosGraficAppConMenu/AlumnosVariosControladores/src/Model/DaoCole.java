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
public class DaoCole implements IPersonas{
    ArrayList<Persona> cole;
    
    public DaoCole(){
        cole = new ArrayList<>();
    }

    @Override
    public void anyadirPersona(Persona p) {
       if(!cole.contains(p)){
           cole.add(p);
       }
    }

    @Override
    public Persona buscarPorNombre(String nombre) {
        Persona encontrada = null;
        for(Persona aux : cole){
            if(aux.getNombre().equalsIgnoreCase(nombre)){
                encontrada = aux;
            }
        }
        return encontrada;
    }

    @Override
    public void eliminarPersona(Persona p) {
        //TODO: eliminar persona  p del arraylist
    }
    
    @Override
    public void eliminarPersona(String nombre) {
        //TODO: eliminar persona con ese nombre del arraylist
    }

    /**
     * Devuelve la lista de personas en un string con cada persona en una linea
     * @return 
     */
    @Override
    public String listadoPersonas() {
        String res ="";
        for(Persona p : cole){
            res += p.toString();
            res+="\n";
        }
        return res;
    }

    
    
    
}
