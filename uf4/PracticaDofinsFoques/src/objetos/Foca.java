/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author alumne
 */
public class Foca {
    private int pes;
    private final int edat;
    private int Resistencia;
    private int distancia_recorreguda;

    public Foca(int pes, int age) {
      
        if (age<=35 && age > 0)
        {
            this.edat = age;
        }
        else
        {
            this.edat = 35;
        }
        
        if (pes<=140 && pes > 0)
        {
              this.pes = pes;
        }
        else
        {
            this.pes = 140;
        }
        this.Resistencia=3;
        this.distancia_recorreguda=0;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public int getPes() {
        return pes;
    }

    public int getEdat() {
        return edat;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }
    
    public void AugmentarResistencia(int num)
    {
        this.Resistencia += num;
    }
    
    public void sprint()
    {
        int velocidad_sprint = this.edat * (200-this.pes);
        if (Resistencia>0)
        {
            velocidad_sprint = velocidad_sprint*2;
            //velocidad_sprint *= 2;
            Resistencia--;
        }
        
        this.distancia_recorreguda += velocidad_sprint;
        System.out.println("Foca va por " + this.distancia_recorreguda);

    }
}
