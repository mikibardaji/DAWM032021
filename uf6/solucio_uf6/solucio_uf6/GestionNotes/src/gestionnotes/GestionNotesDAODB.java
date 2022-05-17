/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnotes;

import Conexion.DbConnect;
import Objetos.ExceptionDocencia;
import Objetos.ExceptionNota;
import Objetos.Notes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jofe0779
 */
public class GestionNotesDAODB {
    Connection conn;
    Statement stmt;
    private final String TABLA = "notas_modulo";
    private final String DOCENCIA = "hores_docencia";
    private final String NOTA = "nota";
    
    public int addNota(Notes nota){
        boolean existe = existNota(nota);
        
        if (!existe)
        {
        String query = "INSERT INTO " + TABLA + " VALUES ('" + nota.getNom().toUpperCase() + "','" + nota.getUf().toUpperCase() + "',"
                + nota.getHoresDocencia() + "," + nota.getNota() + ")";
        
        try {
            conn = DbConnect.getConnection();
            if (conn != null) { //se ha hecho la conexión ok
                stmt = conn.createStatement();
                
                int rows = stmt.executeUpdate(query);
                
                stmt.close();
                conn.close();
                
                return rows;
            }    
        } catch (SQLException ex) {
            int error = ex.getErrorCode();
            
            return error;
        } 
        return 0;    
        }
        else //si ya existia
        {
            return -2;
        }
    }
    
    public int modifyNota(Notes find,double nota){
        String query = "UPDATE " + TABLA + 
                " SET nota = " + nota + 
                " WHERE nom = '" + find.getNom().toUpperCase() + 
                "' AND uf = '" + find.getUf().toUpperCase() + "'";
        //System.out.println(query);
        try {
            conn = DbConnect.getConnection();
            if (conn != null) { //se ha hecho la conexión ok
                stmt = conn.createStatement();
                //System.out.println("Query--> " + query); //lo quitare despues
                
                int rowsAfected = stmt.executeUpdate(query);
                
                stmt.close();
                conn.close();
                
                return rowsAfected;
            }    
            
        } catch (SQLException ex) {
            int error = ex.getErrorCode();
            return error;
        }
        return 0;
    }
    
    public int removeNota(Notes del){
        
        String query = "DELETE FROM " + TABLA + 
                " WHERE nom = '" 
                + del.getNom().toUpperCase() + "' AND uf = '" 
                + del.getUf().toUpperCase() + "'";
        //System.out.println(query);
        
        try {
            conn = DbConnect.getConnection();
            if (conn != null) { //se ha hecho la conexión ok
                stmt = conn.createStatement();
                //System.out.println("Query--> " + query); //lo quitare despues
                
                int rowsAfected = stmt.executeUpdate(query);
                
                stmt.close();
                conn.close();
                
                return rowsAfected;
            }    
        } catch (SQLException ex) {
            int error = ex.getErrorCode();
            if (error==20)
            {
                return -1;
            }
            return error;
        } 
        return 0;
    }
    
    public ArrayList<Notes> listNotas(){
        ArrayList<Notes> notas = new ArrayList<>();
        
        String query = "SELECT * FROM " + TABLA 
                + " ORDER BY nom ASC,uf ASC";
        
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                
                stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);

                while (res.next()) {
                    
                    String nom = res.getString("nom");
                    String uf = res.getString("uf");
                    int hores = res.getInt("hores_docencia");
                    double nota = res.getDouble("nota");
                    
                    notas.add(new Notes(nom, uf, hores, nota));

                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            return null;
        } catch (ExceptionNota ex) {
            Logger.getLogger(GestionNotesDAODB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExceptionDocencia ex) {
            Logger.getLogger(GestionNotesDAODB.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return notas;
    }
    
    public int getNum(ArrayList<Notes> notas){
        return notas.size();
    }
    
    public double averageNota(String modul){
        String query = "SELECT AVG(nota) FROM " 
                + TABLA + " "
                + "WHERE nom = '" + modul.toUpperCase() + "'";
        double media= 0; 
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                
                stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);        
                if(res.next()) {
                    media = res.getDouble(1);
                }

                res.close();
                stmt.close();
                conn.close();
                return media;
            }
        } catch (SQLException ex) {
            int error = ex.getErrorCode();
            return error;
        }
        
        return 0;
    }
    
    
    public double averageNota2(String modul){       
        String query = "SELECT hores_docencia, notas "
                + "FROM " + TABLA + 
                " WHERE nom = '" + modul.toUpperCase() + "'";
        int acum_horas=0, acum_notas=0;
        double media=0;
        
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                
                stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);
                while(res.next()) {
                    acum_horas += res.getInt(DOCENCIA);
                    acum_notas = acum_notas + (res.getInt(DOCENCIA)*res.getInt(NOTA));
                }
                res.close();
                stmt.close();
                conn.close();              
                media = (double) acum_notas/acum_horas;
                
                return media;
            }
        } catch (SQLException ex) {
            int error = ex.getErrorCode();
            return error;
        }
        
        return 0;
    }

    private boolean existNota(Notes nota) {
        
        
        String query = "SELECT * FROM " + TABLA + "" + 
                 " where nom = '" + nota.getNom().toUpperCase() + "' " 
        + " AND UF='" + nota.getUf().toUpperCase() + "'";
        boolean exist = false;
        
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                
                stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);

                if (res.next())
                {
                    exist = true;
                }
                else
                {
                    exist = false;
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //nada
        }
        
        return exist;
                
        
    }
    
    
    
}
