package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{
    public JPanel panel1;
    public  JButton boton1;

     JTextField texto;

    public JLabel saludo;



    public Ventana(){

        //ventana
        this.setSize(500,500);
        setTitle("Hola mundo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //panel
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.BLUE);
        this.getContentPane().add(panel1);


        //etiqueta
        JLabel etiqueta = new JLabel("INGRESE NOMBRE",SwingConstants.CENTER);
        etiqueta.setSize(200,200);
        etiqueta.setLocation(150,5);
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);
        etiqueta.setFont(new Font("chiller",Font.BOLD,30));
        panel1.add(etiqueta);


        //caja de texto
        CajaDeTexto();

        //boton
        boton1 = new JButton();
        boton1.setText("click");
        boton1.setBounds(200,200,100,50);
        boton1.setMnemonic('c');
        panel1.add(boton1);


        boton1.addActionListener(this);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            ventana2 secundaria = new ventana2(this,true);
            secundaria.setVisible(true);
        }
    }


    //caja de texto
    public void CajaDeTexto(){
    texto= new JTextField();
        texto.setBounds(150,150,200,30);

       panel1.add(texto);

    }



}
