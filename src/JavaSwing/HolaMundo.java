package JavaSwing;

import javax.swing.*;
import java.awt.*;

    public class HolaMundo extends JFrame {
        public HolaMundo(){
            this.setSize(500,500);
            setTitle("Hola mundo");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            componentes();
        }
        private void componentes(){
            JPanel panel1 = new JPanel();

            panel1.setLayout(null);
            panel1.setBackground(Color.BLUE);
            this.getContentPane().add(panel1);

            JLabel etiqueta = new JLabel("HOLA MUNDO",SwingConstants.CENTER);
            etiqueta.setSize(200,200);
            etiqueta.setLocation(150,100);
            etiqueta.setOpaque(false);
            etiqueta.setBackground(Color.WHITE);
            etiqueta.setFont(new Font("chiller",Font.BOLD,30));
            panel1.add(etiqueta);





        }

    }


