package paola.ejemplogui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EjemploGUI extends JFrame implements ActionListener{
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton;

    public EjemploGUI() {
        super("Interfaz de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        etiqueta = new JLabel("Ingresa tu nombre:");
        campoTexto = new JTextField(20);
        boton = new JButton("Enviar");
        boton.addActionListener(this);

        add(etiqueta);
        add(campoTexto);
        add(boton);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String nombre = campoTexto.getText();
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!");
        }
    }

    public static void main(String[] args) {
        EjemploGUI2 interfaz = new EjemploGUI2();
    }
}
