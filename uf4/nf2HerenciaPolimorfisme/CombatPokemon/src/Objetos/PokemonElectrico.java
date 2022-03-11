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
public final class PokemonElectrico extends Pokemon {
    private int potenciador;

    public PokemonElectrico(String nombre) {
        super(nombre);
         this.LP = 50;
         potenciador = 2;
    }

    @Override
    public int atac() {
        int ataque_normal = super.atac(); 
        if (ataque_normal<=4 && potenciador>0)
        {
            ataque_normal +=5;
        }
        
        return ataque_normal;
    }

    @Override
    public void recibirImpacto(Pokemon pok) {
                   int golpe_ataque = pok.atac();
          
          
               if (pok instanceof PokemonAgua)
               {
                   golpe_ataque =  (int) (golpe_ataque * 0.75);
               }
               this.LP -= golpe_ataque;
               
          
           if(this.LP<=0)
           {
               this.LP = 0;
               this.vivo=false;
           }
           mostrarEstadoPokemon();
    }
    
    
}
