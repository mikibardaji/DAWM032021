/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author usuari
 */
public class PokemonAgua extends Pokemon {
    private int corassa;
    public PokemonAgua(String nombre) {
        super(nombre);
        this.LP = 45;
        corassa=2;
    }

    @Override
    public void recibirImpacto(Pokemon pok) {
           int golpe_ataque = pok.atac();
           if(corassa>0)
           {
               System.out.println("No recibo ataque por la corza");
               corassa--;
           }
           else
           {
               if (pok instanceof PokemonVeneno)
               {
                   golpe_ataque =  (int) (golpe_ataque * 0.75);
               }
               this.LP -= golpe_ataque;
               
           }
           if(this.LP<=0)
           {
               this.LP = 0;
               this.vivo=false;
           }
           mostrarEstadoPokemon();
    }
    
    
}
