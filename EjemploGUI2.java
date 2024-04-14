package paola.ejemplogui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploGUI2 extends JFrame implements ActionListener{
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton, botonCambiarColor;
    private Color colorVentana = Color.WHITE;
    private int ancho = 400, alto = 300;

    public EjemploGUI2() {
        super("Interfaz de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(ancho, alto);

        etiqueta = new JLabel("Ingresa tu nombre:");
        etiqueta.setBounds(50, 20, 150, 30);
        
        campoTexto = new JTextField();
        campoTexto.setBounds(180, 20, 130, 30);
        
        boton = new JButton("Enviar");
        boton.setBounds(50, 70, 120, 30);
        boton.addActionListener(this);
        
        botonCambiarColor = new JButton("Cambiar Color");
        botonCambiarColor.setBounds(180, 70, 120, 30);
        botonCambiarColor.addActionListener(this);

        setLayout(null);

        add(etiqueta);
        add(campoTexto);
        add(boton);
        add(botonCambiarColor);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String nombre = campoTexto.getText();
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!");
        } else if (e.getSource() == botonCambiarColor) {
            colorVentana = JColorChooser.showDialog(this, "Selecciona un color", colorVentana);
            getContentPane().setBackground(colorVentana);
        } 
    }
}
