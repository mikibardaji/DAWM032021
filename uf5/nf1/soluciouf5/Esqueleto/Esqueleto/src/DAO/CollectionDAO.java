/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceptions.LimitAnimalException;
import Objetos.InterfaceDAO;
import Objetos.Specie;
import java.util.ArrayList;
import javax.naming.LimitExceededException;

/**
 *
 * @author usuari
 */
public class CollectionDAO implements InterfaceDAO {

    private int num_animal;
    private ArrayList<Specie> animales;

    public CollectionDAO() {

        this.animales = new ArrayList<>();
    }

    public int getNum_animal() {
            return num_animal;
    }

    public void setNum_animal(int num_animal) {
        this.num_animal = num_animal;
    }

    public ArrayList<Specie> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Specie> animales) {
        this.animales = animales;
    }

    @Override
    public boolean AfegirObjecte(Specie add) throws LimitAnimalException {
        if (animales.size() < 10) {
            if (!animales.contains(add)) {
                
                return animales.add(add);
            } else {
                return false;
            }
        } else {
            throw new LimitAnimalException("Limite de animales alcanzado");
        }

    }

    @Override
    public boolean EsborrarObjecte(Specie add) {
        return animales.remove(add);

    }



    @Override
    public ArrayList<Specie> getCollectionInventada() {
        return animales;
    }

    @Override
    public int numeroObjectesGuardats() {
        return animales.size();
    }

    /**
     *
     * @param old
     * @param upd
     * @return
     * @throws LimitExceededException
     */
    @Override
    public Specie modificarEspecie(Specie old, int new_individual) throws LimitExceededException {
        int pos = animales.indexOf(old); //porque tengo el equals implementado
        
        if (pos!=-1)
               {    
                    animales.get(pos).setNumIndividuals(new_individual);
                    return animales.get(pos);
                }
            
        
        return  null;
    }

    @Override
    public ArrayList<Specie> shortList() {
        int num_maxim = 5;
        ArrayList<Specie> shortList = new ArrayList<>();
        
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNumIndividuals() <= num_maxim) {
                shortList.add(animales.get(i));
            }
        }
        return shortList;
    }

   

}
