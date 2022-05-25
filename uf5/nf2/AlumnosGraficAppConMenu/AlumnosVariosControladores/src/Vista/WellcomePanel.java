/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rsesen
 */
public class WellcomePanel extends JPanel {
    
    public WellcomePanel(){
        initComponents();
    }

    private void initComponents() {
        JLabel label = new JLabel("Wellcome to my app");
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        add(label,BorderLayout.CENTER);
    }
    
}
