/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author rsesen
 */
public class PanelListado extends JPanel {
    public JTextArea textarea;
    
    public PanelListado(){
        initElements();
    }
    
    public void initElements(){
        setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Listar Elementos");
        textarea = new JTextArea(100,100);
        textarea.setEditable(false);
        add(titulo,BorderLayout.NORTH);
        add(textarea,BorderLayout.CENTER);
        
    }
}
