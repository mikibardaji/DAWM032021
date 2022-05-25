/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rsesen
 */
public class PanelAnyadir extends JPanel{
    public JButton btGuardar, btReset, btAnyadir,btListar;
    public JTextField tfnombre,tfapellidos,tfedad;
    public JComboBox combo;
    public JLabel resultado;
    
    public PanelAnyadir(){
        initElements();
    }
    
    public void initElements(){
       //Panel 1: Norte
       JPanel panel1 = new JPanel();
       panel1.setLayout(new FlowLayout());
       panel1.add(new JLabel("Introducir Datos"));
       
       //Panel 2: Centro
       JPanel panel2 = new JPanel();
       GridLayout gl = new GridLayout(2,4); //definimos filas y cols
       gl.setHgap(5); gl.setVgap(5);
       panel2.setLayout(gl);
       JLabel lbnombre = new JLabel("Nombre:");
       tfnombre = new JTextField(10);
       JLabel lbapellidos = new JLabel("Apellidos:");
       tfapellidos = new JTextField(10);
       JLabel lbedad = new JLabel("Edad:");
       tfedad = new JTextField(10);
       JLabel lbciclo = new JLabel("Ciclo:");
       combo = new JComboBox();
       combo.addItem("ASIX");
       combo.addItem("DAM");
       combo.addItem("DAW");
       
       panel2.add(lbnombre);
       panel2.add(tfnombre);
       panel2.add(lbapellidos);
       panel2.add(tfapellidos);
        panel2.add(lbedad);
       panel2.add(tfedad);
       panel2.add(lbciclo);
       panel2.add(combo);
       
       
       
       //Panel 3: Sur
       JPanel panel3 = new JPanel();
       panel3.setLayout(new FlowLayout());
       btGuardar = new JButton("Guardar");
       btReset = new JButton("Reset");
       panel3.add(btGuardar);
       panel3.add(btReset);
       
       //Panel 4: Derecha
       JPanel panel4 = new JPanel();
       resultado= new JLabel("Result");
       panel4.add(resultado);
 
       
       
       //añadimos al container panel
       add(panel1,BorderLayout.NORTH);
       add(panel2,"Center");
       add(panel3,"South");
       add(panel4,"East");
    }
}
