/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author alumne
 */
public class VentanaAlumnos extends JFrame{
    
    private JMenuBar menuBar;
    private JMenuItem menuItemGuardar, menuItemNuevoPanel;



    public VentanaAlumnos()  {
        //configurant finestra principal
        super("Gestió Alumnes");
        setSize(1000,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //que no se puede redimensionar
        //añadir panel con los componenentes
        
        setContentPane(new PanelDatosAnyadir());
        anyadirMenu();
        setVisible(true);
       
        
    }

    private void anyadirMenu() {
        menuBar = new JMenuBar(); //
        JMenu menu;
        
        menu = new JMenu("Options");
        menuItemGuardar = new JMenuItem("Guardar"); //defino item
        menuItemGuardar.setActionCommand("guardar"); //defino el nombre de la action
        menu.add(menuItemGuardar); //añadi el item al jmenu
        
        menuBar.add(menu);
        
        
        JMenu menu2;
        
        menu2 = new JMenu("Panel");
        menuItemNuevoPanel = new JMenuItem("menuItemNuevoPanel"); //defino item
        menuItemNuevoPanel.setActionCommand("menuItemNuevoPanel"); //defino el nombre de la action
        menu2.add(menuItemNuevoPanel); //añadi el item al jmenu
        menuBar.add(menu2);
        //añado barra de menú
        this.setJMenuBar(menuBar);
    }
    
    
    public JMenuItem getMenuItemGuardar() {
        return menuItemGuardar;
    }
    
}
