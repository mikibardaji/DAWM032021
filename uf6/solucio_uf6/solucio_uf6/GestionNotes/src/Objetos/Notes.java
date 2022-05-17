/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author jofe0779
 */
public class Notes {
    private String nom;
    private String uf;
    private int horesDocencia;
    private double nota;

    public Notes(String nom, String uf, int horesDocencia, double nota) throws ExceptionNota, ExceptionDocencia {
        this.nom = nom;
        this.uf = uf;
        this.setNota(nota);
        this.setHoresDocencia(horesDocencia);
    }

    public Notes(String nom, String uf) throws ExceptionDocencia, ExceptionNota {
        this.nom = nom;
        this.uf = uf;
        setNota(0);
        setHoresDocencia(0);
    }

    public Notes() {
    }

    
    
    
    public String getNom() {
        return nom;
    }

    public String getUf() {
        return uf;
    }

    public int getHoresDocencia() {
        return horesDocencia;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Notes:\n Assignatura: " + this.nom + "\n UF: " + this.uf + "\n Hores: " + this.horesDocencia + "\n Nota: "
                + this.nota;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setHoresDocencia(int horesDocencia) throws ExceptionDocencia {
        if (horesDocencia>= 0)
        {
            this.horesDocencia = horesDocencia;
        }
        else
           throw new ExceptionDocencia();
    }

    public void setNota(double nota) throws ExceptionNota {
        if (nota>= 0 && this.nota<=10)
        {
            this.nota = nota;
        }
        else
        {
            throw new ExceptionNota();
        }
           
    }
    
    
}
