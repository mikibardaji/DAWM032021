/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorMenu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rsesen
 */
public class VentanaApp extends JFrame{
    public JMenuBar menuBar;
    public JMenuItem menuItemAnyadir,menuItemListar,menuItemAbout;
    
    //añado paneles
    public PanelAnyadir panel1;
    

    public VentanaApp() {
        super("Personas Grafics App");
        setSize(600,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anyadirMenu();    
        setResizable(false);
        setVisible(true);
    }
    
    public void anyadirMenu(){
        
        menuBar = new JMenuBar();
        JMenu menu;
        
        //file menu
        menu = new JMenu("Options");
        menuItemAnyadir = new JMenuItem("Añadir");
        menuItemAnyadir.setActionCommand("anyadir");
        menu.add(menuItemAnyadir);
        
        menuItemListar = new JMenuItem("Listar");
        menuItemListar.setActionCommand("listar");
        menu.add(menuItemListar);
        menuBar.add(menu);
        
        //options menu
        menu = new JMenu("Help");
        menuItemAbout = new JMenuItem("About");
        menuItemAbout.setActionCommand("about");
        menu.add(menuItemAbout);   
        menuBar.add(menu);
        
        //añado barra del menu
        setJMenuBar(menuBar);
    }
    
}
