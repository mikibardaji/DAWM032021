/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Vista.PanelAnyadir;
import Vista.PanelListado;
import Vista.VentanaApp;
import Vista.VentanaGeneral;
import Vista.WellcomePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class ControladorMenu implements ActionListener {
    VentanaGeneral ventana;
    DaoCole daocole;
   // AnyadirPanel anyadir;
    
    public ControladorMenu(VentanaGeneral ventana, DaoCole daocole){
        this.ventana = ventana;
        this.daocole = daocole;
        iniciarListener();
    }
    
    public void iniciarListener(){
        ventana.menuItemAnyadir.addActionListener(this);
        ventana.menuItemListar.addActionListener(this);
        ventana.menuItemAbout.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String action = e.getActionCommand();
        switch (action) {
            case "anyadir":
                mostrarPanelAnyadir();
                break;
                
            case "listar":
                mostrarPanelListar();
                break;

            case "about":
                mostrarWellcomePanel();
                break;
        }
    }
    
    private void mostrarPanelListar(){
        PanelListado panellistado = new PanelListado();
        ventana.setContentPane(panellistado);
        ControladorPanelListar controllistar = new ControladorPanelListar(panellistado,daocole);
        ventana.validate();
    }

    private void mostrarWellcomePanel() {
        ventana.setContentPane(new WellcomePanel());
        ventana.validate();
    }
    private void mostrarPanelAnyadir(){
        PanelAnyadir afegir = new PanelAnyadir();
        
        ControladorPanelAnyadir control = new ControladorPanelAnyadir(afegir,daocole);
        ventana.setContentPane(afegir);
        ventana.validate();
 
        
    }
    
}
