/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosDAO;

import java.util.Random;

/**
 *
 * @author usuari
 */
public class Punto {
    
    private int x;
    private int y;
    
   
    public Punto()
    {
        
    }
    
    public Punto(int x1, int y1)
    {
        this.x = x1;
        this.y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**mostrar la pantalla la coordenada*/
    public void imprime()
    {
        System.out.println("("+this.x+","+this.y+")");
        
    }
    
    public void setXY(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }
    
    public void desplaza(int dx, int dy)
    {
        this.x += dx;
        this.y = this.y + dy;
    }
    
    
    public double distancia(Punto p)
    {
        int restax = p.getX() - this.x;
        int restay = p.getY() - this.y;
        int cuadradoX = (int) Math.pow(restax, 2.0);
        int cuadradoY = (int) Math.pow(restay, 2.0);
        int suma = cuadradoX + cuadradoY;
        double raiz = Math.sqrt(suma);
        return raiz;
    }
            
    
    //no pertenece a los objetos, sino que pertence a la clase
    public static Punto creaPuntoAleatorio()
    {
        Punto ejemplo;
        Random rd = new Random();
        int coordx = rd.nextInt(201)-100; //-100 al 100, que son 201 posibles valores
        int coordy = rd.nextInt(201)-100;
        ejemplo= new Punto(coordx, coordy);
    
        return ejemplo;
    }
    
    
        
    //no pertenece a los objetos, sino que pertence a la clase
    public static void creaPuntoAleatorio(Punto y)
    {
        Punto ejemplo;
        Random rd = new Random();
        int coordx = rd.nextInt(201)-100; //-100 al 100, que son 201 posibles valores
        int coordy = rd.nextInt(201)-100;
        y= new Punto(coordx, coordy);
    
    
    }
            
}
