/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamongui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author mabardaji
 */
public class HolaMonGUI extends JFrame{

    public HolaMonGUI()  {
        //component JLabel es una etiqueta
        JLabel missatge = new JLabel("Hola Mon");
        missatge.setBounds(150, 230, 200, 200);
        //configuro algunos parametros ventana JFRAME
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //añadimos el component al contenedor principal de la JFRAME
        this.getContentPane().add(missatge);
        //darle tamaño a la ventana
        this.setSize(500, 200);
        this.setVisible(true);
  
    }


    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HolaMonGUI();
    }
    
}
