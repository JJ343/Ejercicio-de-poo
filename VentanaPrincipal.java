import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class VentanaPrincipal extends JFrame{
    private JPanel VentanaPrincipal;
    private JButton cilindroButton;
    private JButton esferaButton;
    private JButton piramideButton;

    public VentanaPrincipal(){
        setContentPane(VentanaPrincipal);
        setTitle("Figuras");
        setSize(350,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        cilindroButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JFrame  cilin = new VentanaCilindro();
                cilin.setVisible(true);





            }


        });
        esferaButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JFrame esfera = new VentanaEsfera();
                esfera.setVisible(true);
            }


        });
        piramideButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JFrame piramide =new Ventanapiramide();
                piramide.setVisible(true);

            }
        });
    }
}
