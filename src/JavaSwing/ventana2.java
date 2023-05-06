package JavaSwing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ventana2 extends JDialog implements ActionListener{


    private JButton boton2;
    private JLabel label1;

    private JPanel panel2;

    private JLabel etiqueta;

    public ventana2(Ventana parent, boolean modal) {

        super();

        setSize(500,500);
        setTitle("Hola mundo");
        setLocationRelativeTo(null);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.BLUE);
        this.getContentPane().add(panel2);


        label1 = new JLabel();
        label1.setText("HOLA");
        label1.setSize(115,60);
        label1.setLocation(200,30);
        label1.setOpaque(false);
        panel2.add(label1);


        boton2 = new JButton("Volver");
        boton2.setBounds(135,110,200,40);
        panel2.add(boton2);


        boton2.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {

            setVisible(false);
        }
    }

}