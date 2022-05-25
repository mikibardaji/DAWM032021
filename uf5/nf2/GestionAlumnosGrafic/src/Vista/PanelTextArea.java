/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author alumne
 */
public class PanelTextArea extends JPanel{
    JTextArea area;

    public PanelTextArea() {
        this.area = new JTextArea();
        area.setText("nueva ventana");
        add(area,BorderLayout.CENTER);
    }
    
    
}
