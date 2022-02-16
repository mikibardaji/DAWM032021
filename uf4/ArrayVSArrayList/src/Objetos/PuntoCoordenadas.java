/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class PuntoCoordenadas {
    private int x;
    private int y;

    /**constructores*/
    
    public PuntoCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PuntoCoordenadas(int x) {
        this.x = x;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String todasCoordenadas()
    {
        return " x=" + this.x +  " , y=" + this.y;
    }
    
}
