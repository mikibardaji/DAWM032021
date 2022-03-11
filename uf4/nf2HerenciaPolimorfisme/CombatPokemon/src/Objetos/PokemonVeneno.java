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
public final class PokemonVeneno extends Pokemon  {
    private boolean defensa;

    public PokemonVeneno(String nombre) {
        super(nombre);
         this.LP = 45;
         defensa=false;
    }

    @Override
    public void recibirImpacto(Pokemon pok) {
               int golpe_ataque = pok.atac();
          
          
               if (pok instanceof PokemonAgua)
               {
                   golpe_ataque =  (int) (golpe_ataque * 0.75);
               }
               
               if (!defensa)
               {
                   this.LP -= golpe_ataque;
               }
               else
               {
                   this.LP -= (golpe_ataque/2);
               }
            if(this.LP <15)
            {
                defensa=true; //activada
            }
          
           if(this.LP<=0)
           {
               this.LP = 0;
               this.vivo=false;
           }
           mostrarEstadoPokemon();

        
    }
  

}
