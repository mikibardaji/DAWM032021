/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatpokemon;

import Objetos.Pokemon;
import Objetos.PokemonAgua;
import Objetos.PokemonElectrico;
import Objetos.PokemonVeneno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class CombatPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> combatientes = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        //inicializar array con dos combatientes
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("nombre pokemon");
            String nombre = sc.nextLine();
            System.out.println("tipo Pokemon");
            String tipo = sc.nextLine();
            if (tipo.equalsIgnoreCase("Agua"))
            {
                combatientes.add(new PokemonAgua(nombre));
            }
            else if (tipo.equalsIgnoreCase("Veneno"))
            {
                combatientes.add(new PokemonVeneno(nombre));
            }
            else
            {
                combatientes.add(new PokemonElectrico(nombre));
            }
        }
        
        //Lucha
        
        while(combatientes.get(0).isVivo()&& combatientes.get(1).isVivo())
        {
            combatientes.get(0).recibirImpacto(combatientes.get(1));
            if(combatientes.get(0).isVivo())
            {
            combatientes.get(1).recibirImpacto(combatientes.get(0));    
            }
            
        }
        
        
    }
    
}
