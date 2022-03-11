/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author usuari
 */
public abstract class Pokemon implements AccionesCombate{
    protected final String nombre;
    protected double LP;
    protected boolean vivo;

    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLP() {
        return LP;
    }

    public boolean isVivo() {
        return vivo;
    }

    @Override
    public String toString() {
        return nombre + " " + this.LP + " vida ";
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        if (!(obj instanceof Pokemon))
                {
                    return false;
                }

        final Pokemon other = (Pokemon) obj;
        return this.nombre.equalsIgnoreCase(other.getNombre());
    }

    @Override
    public  int atac()
    {
        Random rd = new Random();
        int golpe = (rd.nextInt(10)+1);
        System.out.println("Ataco con " + golpe);
        return golpe;
                
    }

    @Override
    public abstract void recibirImpacto(Pokemon pok);

    protected void mostrarEstadoPokemon()
    {
        String basico = this.toString();
        if(this.vivo)
        {
            basico = basico + " vivo ";
        }
        else
        {
            basico = basico + " muerto ";
        }
        
        System.out.print(basico);
        for (int i = 0; i < this.LP; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }
    


}
