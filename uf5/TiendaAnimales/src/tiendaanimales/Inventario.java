/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaanimales;

import Objetos.Mascotas;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Esta clase seria para seguir la dinamica de accceso de datos (DAO)
 * @author alumne
 */
public class Inventario {
    private ArrayList<Mascotas> catalogo;

    public Inventario() {
        this.catalogo = new ArrayList<Mascotas>();
    }

    public ArrayList<Mascotas> getCatalogo() {
        return catalogo;
    }
    
    public int getNumMascotas()
    {
        return catalogo.size();
    }
    
    public void MostrarListaAnimales()
    {
//        for (int i = 0; i < catalogo.size(); i++) {
//            System.out.println(catalogo.get(i).toString());            
//        }
       
        for (Mascotas pet : catalogo) {
            System.out.println(pet.toString());
        }
        
        
        System.out.println("numero de mascotas " + getNumMascotas());
    }
    
    public void MostrarListaAnimalesCortos() {
        for (Mascotas pet : catalogo) {
            System.out.println(pet.datos_cortos());
        }
        
        
        System.out.println("numero de mascotas " + getNumMascotas());
    }
    
    
    
    public void VaciarInventario()
    {
        catalogo.clear();
        
        System.out.println("He borrado todos los elemenots");
    }
    
    
    public void InsertarAnimal(Mascotas anyadir)
    {
        //comprobar si ya esta añadido
        //y si no esta añadido hacerlo sino avisar
        //haria falta el equals
        catalogo.add(anyadir);
     //   Iterator t;
        
    }


}
