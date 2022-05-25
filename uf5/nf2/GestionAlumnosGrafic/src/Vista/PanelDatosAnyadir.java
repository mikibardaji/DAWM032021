/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * esta clase tendra los componentes de la ventana principal
 * @author alumne
 */
public class PanelDatosAnyadir extends JPanel{
    private JButton btGuardar, btReset, btListar;
    private JTextField tfNombre,tfApellidos,tfEdad; //cuadres de text
    private JComboBox cmbCiclo;
    private JLabel resultado;
    private JTextArea listar; //para que pueda contener mas caracteres

    public PanelDatosAnyadir() {
        initComponents();
    }

    //añadir los components del panel
    private void initComponents() {
        JPanel panelSuperior = new JPanel();//arriba = Norte
        panelSuperior.setLayout(new FlowLayout());
        //setLayout(null) para poder redifinir los botones
        panelSuperior.add(new JLabel("Introduce Datos"));
        
        //panel Central
        JPanel panelCentral = new JPanel();
        GridLayout gl = new GridLayout(2, 5);
        gl.setHgap(5);
        gl.setVgap(5);
        panelCentral.setLayout(gl);
        JLabel lblNombre = new JLabel("Nombre:");
        tfNombre = new JTextField(10);
        JLabel lblApellido = new JLabel("Apellido:");
        tfApellidos = new JTextField(10);
        JLabel lblEdad = new JLabel("Edad:");
        tfEdad = new JTextField(3);
        JLabel lblCiclo = new JLabel("Ciclo:");
        cmbCiclo = new JComboBox();
        cmbCiclo.addItem("ASIX");
        cmbCiclo.addItem("DAW");
        cmbCiclo.addItem("DAM");
        listar = new JTextArea("ejemplo");
        //1,1
        panelCentral.add(lblNombre);
        //1,2
        panelCentral.add(tfNombre);
        //1,3
        panelCentral.add(lblApellido);
        //1,4
        panelCentral.add(tfApellidos);
        //1,5
        panelCentral.add(listar);
        //2,1
        panelCentral.add(lblEdad);
        //2,2
        panelCentral.add(tfEdad);
        //2,3
        panelCentral.add(lblCiclo);
        //2,4
        panelCentral.add(cmbCiclo);
        
        //panel inferior con los botones - SUR
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout());
        btGuardar = new JButton("Guardar");
        btReset = new JButton("Reset");
        btListar = new JButton("Listar");
        resultado = new JLabel("--");
        panelInferior.add(btGuardar);
        panelInferior.add(btReset);
        panelInferior.add(btListar);
        panelInferior.add(resultado);
        
        this.add(panelSuperior, BorderLayout.NORTH); //this = PanelDatosAnyadir
        this.add(panelCentral, BorderLayout.CENTER); //this = PanelDatosAnyadir
        this.add(panelInferior, BorderLayout.SOUTH); //this = PanelDatosAnyadir
    }

    public JButton getBtGuardar() {
        return btGuardar;
    }

    public JButton getBtReset() {
        return btReset;
    }

    public JButton getBtListar() {
        return btListar;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public JTextField getTfApellidos() {
        return tfApellidos;
    }

    public JTextField getTfEdad() {
        return tfEdad;
    }

    public JComboBox getCmbCiclo() {
        return cmbCiclo;
    }

    public JLabel getResultado() {
        return resultado;
    }

    public JTextArea getListar() {
        return listar;
    }

    public void setTfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
    }

    public void setTfApellidos(JTextField tfApellidos) {
        this.tfApellidos = tfApellidos;
    }

    public void setTfEdad(JTextField tfEdad) {
        this.tfEdad = tfEdad;
    }

    public void setCmbCiclo(JComboBox cmbCiclo) {
        this.cmbCiclo = cmbCiclo;
    }

    public void setResultado(JLabel resultado) {
        this.resultado = resultado;
    }

    public void setListar(String listar) {
        this.listar.setText(listar);
    }
    
    
    
}
