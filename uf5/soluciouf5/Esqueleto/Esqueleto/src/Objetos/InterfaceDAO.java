/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Objetos;

import Exceptions.LimitAnimalException;
import java.util.ArrayList;
import javax.naming.LimitExceededException;

/**
 *
 * @author alumne
 */
public interface InterfaceDAO {
    
        public boolean AfegirObjecte(Specie add) throws LimitAnimalException ;
        public boolean EsborrarObjecte(Specie add);
        //public Specie EsborrarObjecte(String atribut_inventat);
        public ArrayList<Specie> getCollectionInventada();
        public int numeroObjectesGuardats();
        public Specie modificarEspecie(Specie old, int new_individual) throws LimitExceededException;
        public ArrayList<Specie> shortList();
        /* falta una que l'heu de ficar vosaltres*/
           /*falta codigo SEGURO*/
        //TODO 
    }
        

