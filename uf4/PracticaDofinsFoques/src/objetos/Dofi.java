/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Dofi {
    private final int age;
    private final String Raza;
    private final int speed;
    private int distancia_recorreguda;

    public Dofi(int age, String Raza) {
        if (age<=60 && age > 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 30;
        }
        if(Raza.equalsIgnoreCase("fosc") || 
                Raza.equalsIgnoreCase("austral") )
        {
            this.Raza = Raza;
        }
        else
        {
            this.Raza = "Fosc";
            System.out.println("Raza incorrecta " + Raza + " lo pongo a raza fosc");
        }
        /* speed en funció raça i age*/
        if (this.Raza.equalsIgnoreCase("Fosc"))
        {
            this.speed = 10*age;
        }
        else
        {
            this.speed = 20*age;
        }
        this.distancia_recorreguda=0;
    }

    public int getAge() {
        return age;
    }

    public String getRaza() {
        return Raza;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }
    
    
    private int sprint_final()
      {
          Random rd = new Random();
          int valor = rd.nextInt(76)+25;
          
          return (this.speed+valor);
      }
    
    public void sprint()
    {
        if (this.distancia_recorreguda<400)
        {
            this.distancia_recorreguda += this.speed;
        }
        else
        {
            int sprint_final1 = this.sprint_final();
             this.distancia_recorreguda += sprint_final1;
             
        }
        System.out.println("Dofi va por " + this.distancia_recorreguda);
    }
}
