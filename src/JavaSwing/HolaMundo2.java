package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo2 extends JFrame implements ActionListener{

   public JButton boton2;
    public HolaMundo2(){
        this.setSize(500,500);
        setTitle("Hola mundo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();

        panel1.setLayout(null);
        panel1.setBackground(Color.white);
        this.getContentPane().add(panel1);


        JLabel etiqueta = new JLabel("HAZ CLICK",SwingConstants.CENTER);
        etiqueta.setSize(200,200);
        etiqueta.setLocation(143,40);
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);
        etiqueta.setFont(new Font("agent orange",Font.BOLD,20));
        panel1.add(etiqueta);


        boton2 = new JButton();
        boton2.setText("click");
        boton2.setBounds(200,200,100,50);
        boton2.setMnemonic('c');
        panel1.add(boton2);


        boton2.addActionListener(this);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            VentanaHolaM2 secundaria = new VentanaHolaM2(this,true);
            secundaria.setVisible(true);
        }
    }



}






