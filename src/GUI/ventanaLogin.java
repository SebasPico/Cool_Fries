package GUI;

import javax.swing.*;
import java.awt.*;

public class ventanaLogin extends JFrame {
    JLayeredPane contenedor = new JLayeredPane();
    public ventanaLogin(){
        this.setTitle("Login");
        this.setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//Ventana en el centro de la pantalla

        componentes();
    }//fin del JFrame

    private void componentes(){
        JPanel panel = new JPanel();//Crear panel
        panel.setLayout(null);
        panel.setBackground(Color.white);

        JLabel titulo = new JLabel("BIENVENIDO", SwingConstants.CENTER);
        titulo.setBounds(280,500,300,38);//Posisción y tamaño del JLabel
        titulo.setFont(new Font("Serif",Font.PLAIN,35));//Tamaño y fuente del JLabel

        //fondo para el login
        JLabel fondo = new JLabel();
        fondo.setBackground(Color.PINK);
        fondo.setOpaque(true);
        fondo.setBounds(820,87,450,620);

        //logo
        JLabel logo = new JLabel(new ImageIcon("CoolFries/imagenes/pizza.png"));
        logo.setBounds(10,20,256,256);


        //boton se inicio
        JButton boton = new JButton("INGRESAR");
        boton.setBounds(947,620,190,45);

        JLabel textoInicio = new JLabel("INICIAR SESIÓN");
        textoInicio.setBounds(908,180,300,30);
        textoInicio.setFont(new Font("Serif",Font.BOLD,35));

        //correo
        JLabel correo = new JLabel("Correo");
        correo.setBounds(1000,275,190,45);
        correo.setFont(new Font("Serif",Font.BOLD,25));

        JTextField textoCorreo = new JTextField();
        textoCorreo.setBounds(893,330,300,45);

        //contraseña
        JLabel contrasena = new JLabel("Contraseña");
        contrasena.setBounds(980,420,190,45);
        contrasena.setFont(new Font("Serif",Font.BOLD,25));

        JTextField textoContrasena = new JTextField();
        textoContrasena.setBounds(893,480,300,45);

        contenedor.add(panel,Integer.valueOf(0));
        contenedor.add(titulo,Integer.valueOf(1));
        contenedor.add(fondo,Integer.valueOf(1));
        contenedor.add(logo,Integer.valueOf(2));
        contenedor.add(boton,Integer.valueOf(2));
        contenedor.add(correo,Integer.valueOf(2));
        contenedor.add(contrasena,Integer.valueOf(2));
        contenedor.add(textoCorreo,Integer.valueOf(2));
        contenedor.add(textoContrasena,Integer.valueOf(2));
        contenedor.add(textoInicio,Integer.valueOf(2));


        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }//Fin de lo que va dentro del panel

}//fin de la clase
