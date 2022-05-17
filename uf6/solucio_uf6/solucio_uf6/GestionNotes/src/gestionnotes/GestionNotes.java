/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnotes;

import Conexion.DbConnect;
import Menu.Menu;
import Menu.Option;
import Objetos.ExceptionDocencia;
import Objetos.ExceptionNota;
import Objetos.Notes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jofe0779
 */
public class GestionNotes {
    private GestionNotesDAODB DAO;
    private Menu menu_principal;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionNotes app = new GestionNotes();
        
        app.run();
    }
    
    private void añadir_opciones(Menu menu_principal) {
        menu_principal.add(new Option("Salir "));
        menu_principal.add(new Option("Alta notes"));
        menu_principal.add(new Option("Modificacio notes"));        
        menu_principal.add(new Option("Baixa notes "));
        menu_principal.add(new Option("Llistar notes "));
        menu_principal.add(new Option("Nota mitjana assignatura"));
        menu_principal.add(new Option("Nota mitjana assignatura dificil"));
    }

    private void run() {
        try {
            //load the driver (only once).
            DbConnect.loadDriver();

        
            DAO = new GestionNotesDAODB();
             
            menu_principal = new Menu("Gestiona de notas");
            añadir_opciones(menu_principal);
             
             
            int opcion;
             
            System.out.println("=============");
            //loadItems();
            //int opcion;
            do{
                menu_principal.showMenu();
                opcion = menu_principal.choose("Select option: ");
                switch(opcion)
                {
                    case 1:
                        addNota();
                        break;
                    case 2:
                        modifyNota();
                        break;
                    case 3:
                        removeNota();
                        break;
                    case 4:
                        showNotas();
                        break;
                    case 5:
                        showAverage(opcion);
                        break;
                    case 6:
                        showAverage(opcion);
                        break;
                    case 0:
                        System.out.println("saliendo");
                        break;
                    default:
                        System.out.println("opcion no implementada");
                        break;
                }
            } while(opcion!=0);
        } catch (ClassNotFoundException ex) {
            System.out.println("-->" + ex.getMessage());
            ex.printStackTrace();
        }         
    }
    
    public void addNota(){
        Scanner sc = new Scanner(System.in);
        Notes add=new Notes();
        
        System.out.print("Nom modul (Ex. M02): ");
        add.setNom(sc.nextLine());  
        System.out.print("Nom UF (Ex.UF2): ");
        add.setUf(sc.nextLine());
        
        try{
            System.out.print("Hores de docencia: ");
            int hores = sc.nextInt();
            System.out.print("Nota (0-10): ");
            double nota = sc.nextDouble();
            add.setHoresDocencia(hores);
            add.setNota(nota);
            
            //add = new Notes(nom, uf, hores, nota);
            int cod_error = DAO.addNota(add);
            
            
//            if (cod_error==1406) {
//                System.out.println("No se cumplen las restricciones de nom o uf");
//            }
//            else if (cod_error==4025) {
//                System.out.println("No se cumplen las restricciones de hores lectives o nota");
//            }
//            else
                if (cod_error==-2) {
                System.out.println("Registro duplicado");
            }
            else if (cod_error==20) {
                System.out.println("No se pudo estableser conexion con la BD");
            }
            else if (cod_error>0) {
                System.out.println("Insertado correctamente" + cod_error);
            }
            else
                System.out.println("Error desconocido");
            
            //System.out.println(cod_error);
            
            //1406 - cuando no se cumplen las restricciones de la tabla, en varchar
            //4025 - cuando no se cumplen las restricciones de la tabla, en int
            //1 - registro duplicado
            //20 - No establece conexion con la BD
            
        } catch(InputMismatchException e){
            System.out.println("La nota o las horas solo pueden ser un numero");
        } catch (ExceptionDocencia ex) {
            System.out.println("sdsdsdsd");
            
        } catch (ExceptionNota ex) {
            System.out.println("nota debe ser 10");
            
            Logger.getLogger(GestionNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void modifyNota(){
        Scanner sc = new Scanner(System.in);
        String nom,uf;
        double nota;
        
        System.out.print("Nom modul (Ex. M02): ");
        nom = sc.nextLine();
        System.out.print("Nom UF (Ex.UF2): ");
        uf = sc.nextLine();
        
        try{
            Notes find = new Notes(nom, uf);
            System.out.print("Nova nota: ");
            nota = sc.nextDouble();

            int cod_error = DAO.modifyNota(find, nota);
            

            if (cod_error==0) {
                System.out.println("No se ha encontrado el registro");
            }
            else if (cod_error==4025) {
                System.out.println("No se cumplen las restricciones de nota");
            }
            else if (cod_error==-1)  {
                System.out.println("No se pudo estableser conexion con la BD");
            }
            else if (cod_error>0) {
                System.out.println("Actualizado correctamente" + cod_error);
            }
            else
                System.out.println("Error desconocido");
            
            //System.out.println(cod_error);
            
        } catch(InputMismatchException e){
            System.out.println("La nota solo puede ser un numero");
        } catch (ExceptionDocencia ex) {
            Logger.getLogger(GestionNotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExceptionNota ex) {
            Logger.getLogger(GestionNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void removeNota() {
        Scanner sc = new Scanner(System.in);
        String nom,uf;
        
        System.out.print("Nom modul (Ex. M02): ");
        nom = sc.nextLine();
        System.out.print("Nom UF (Ex.UF2): ");
        uf = sc.nextLine();
        Notes del;
        try {
            del = new Notes(nom, uf);
       
        int cod_error = DAO.removeNota(del);
        
        if (cod_error>0) {
            System.out.println("Borrado correctamente = " + cod_error);
        }
        else if (cod_error==-1) {
            System.out.println("No se pudo estableser conexion con la BD");
        }
        else if (cod_error==0) {
            System.out.println("El registro no existe");
        }
        else
            System.out.println("Error desconocido");

         } catch (ExceptionDocencia ex) {
            Logger.getLogger(GestionNotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExceptionNota ex) {
            Logger.getLogger(GestionNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(cod_error);
        
        //funciona, cuidado confundir el 0 (num) con una o (letra)
        
        //0 - No existe el registro para borrarlo
    }
    
    public void showNotas(){
        ArrayList<Notes> notas;
        
        notas = DAO.listNotas();
        int num_notas =DAO.getNum(notas);
        
        if (notas==null) {
            System.out.println("No hay notas o no se pudo conectar a la BD");
        }
        else{
            if (num_notas==0) {
                System.out.println("De momento no hay notas disponibles");
            }
            else{
                System.out.println("--------------");
                for (Notes nota : notas) {
                    System.out.println(nota.toString());
                    System.out.println("");
                }
                System.out.println("Se han mostrado " + num_notas + " notas");
                System.out.println("--------------");
            }
        }  
    }
    
    public void showAverage(int opcion){
        Scanner sc = new Scanner(System.in);
        String nom;
        
        System.out.print("Nom modul (Ex. M02): ");
        nom = sc.nextLine();
        double nota_media=0;
        if (opcion==5)
            {
                nota_media = DAO.averageNota(nom);
            }
        else
            {
                nota_media = DAO.averageNota2(nom);
            }
        String respuesta = "La nota media del modulo " + nom + " es " + nota_media;
        
        if (respuesta.equals("La nota media del modulo " + nom + " es NaN")) {
            System.out.println("No existe nota media del modulo " + nom);
        }
        else
            System.out.println("La nota media del modulo " + nom + " es " + nota_media);
    }
 
    
 
}
