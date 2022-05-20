/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author alumne
 */
public class VentanaPulsacion extends JFrame{
    private JButton btnAumentar,btnReset;
    private JLabel lblMensaje, lblNum;

    public VentanaPulsacion() {
        super("Ventana contadora de clicks");
        //configuración ventana
        this.setSize(175, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //definirElemento
        definirElementos();
        this.setVisible(true);
        
    }

    private void definirElementos() {
        Container cp = getContentPane(); //contenedor ventana
        cp.setLayout(new FlowLayout());
        btnAumentar = new JButton("Pulsame!");
        btnReset = new JButton("Reiniciar");
        lblMensaje = new JLabel("Pulsaciones: ");
        lblNum = new JLabel("0");
        cp.add(lblMensaje);
        cp.add(lblNum);
        cp.add(btnAumentar);
        cp.add(btnReset);
        
    }

    public JButton getBtnAumentar() {
        return btnAumentar;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public JLabel getLblNum() {
        return lblNum;
    }

    public void setLblNum(JLabel lblNum) {
        this.lblNum = lblNum;
    }
    
    
    
    
}
