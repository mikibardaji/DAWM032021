/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validarpasswordusuariomail;

import java.util.Scanner;

/**
 * Realiza un programa que solicite un nombre de usuario (que obligatoriamente será un email) y un password.
La validación es:
- El nombre de usuario tiene que ser formato email o sea contener una @.
- El password tiene que tener mínimo 8 caracteres.

-El password no debe contener espacios

Tras la validación, informar al usuario de los posibles errores o si no hay:
- "Usuario incorrecto"
- "Password incorrecto"

- "Usuario i password correcto"

Ampliación

-Si tiene espacios(mail o password) debe informar "Formato Incorrecto no debe dejar espacios"

-Solo debe aceptar si el dominio del mail, es "proven.cat", sino informar "dominio mail incorrecto", 
* debereis encontrar donde esta la  @, recortar a partir de ese punto hasta el final y compararlo con "proven.cat"
 */
public class ValidarPasswordUsuarioMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mail_usuari="", password="";
        
        mail_usuari = pedir_datos_entrada("Pon tu mail");
        password = pedir_datos_entrada("Pon tu password");
        
        
       
        
        if (validarMailEntrada(mail_usuari))
        {
            System.out.println("Usuario correcto");
        }
        else
        {
            System.out.println("Usuario incorrecto");
        }
        
        if (validarPasswordEntrada(password))
        {
            System.out.println("Password correcto");
        }
        else
        {
            System.out.println("Password incorrecto");
        }
    }

    /**
     * pide datos de login al usuario
     * @param mail_usuari
     * @param password 
     */
    public static String pedir_datos_entrada(String frase) {
        Scanner sc = new Scanner(System.in);
        String datos;
        
        System.out.println(frase);
        datos = sc.nextLine();
        //sc.close();
        return datos;
       
        
    }

    /**
     * valida el email de entada
     * Que no tenga espacios
     * Que contenga una @
     * Que el dominio del mail sea @proven.cat
     * @return 
     */
    private static boolean validarMailEntrada(String mail_usuari) {
        boolean correcto = true;
        if (mail_usuari.contains(" ")) //si existe el mail es erroneo
        { //otra opcion es indexOf(" ") != -1
            System.out.println("mail con espacios");
            correcto =false;
        }
        
        int pos_arroba = mail_usuari.indexOf("@");
       
        if (pos_arroba==-1)
        {
            System.out.println("mail sin arroba");
            correcto = false; //no hay @
        }
        
        //if(mail_usuari.endsWith("proven.cat"))
        if (!mail_usuari.substring(pos_arroba+1).equals("proven.cat"))
        {
            System.out.println("no tiene el dominio proven.cat");
            correcto =false;
        }
      
        
        return correcto;
        
    }

    /**
     * que no tenga espacios
     * que tenga almenos 8 caracteres
     * 
     * @param password
     * @return 
     */
    private static boolean validarPasswordEntrada(String password) {
        if (password.contains(" ")) //si existe el mail es erroneo
        { //otra opcion es indexOf(" ") != -1
            System.out.println("password con espacios");
            return false;
        }  
        if (password.length()<8)
        {//faltan caracteres
            System.out.println("passsword debe tener 8 caracteres o mas");
            return false;
        }

        return true;

    }


    
}
