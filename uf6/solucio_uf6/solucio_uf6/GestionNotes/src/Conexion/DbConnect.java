/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 34697
 */
public class DbConnect {
       
    //private static DbConnect instance;    
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String PROTOCOL = "jdbc:mysql:";
    static final String HOST = "127.0.0.1";
    static final String BD_NAME = "examen";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(DRIVER);
    }

    /**
     * gets and returns a connection to database
     *
     * @return connection
     * @throws java.sql.SQLException
     */
    public static Connection getConnection() throws SQLException {
        final String BD_URL = String.format("%s//%s/%s", PROTOCOL, HOST, BD_NAME);
        //System.out.println(BD_URL);
        Connection conn = null;
        conn = (Connection) DriverManager.getConnection(BD_URL, USER, PASSWORD);
        return conn;
    }
}
