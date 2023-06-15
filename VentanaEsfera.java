import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends  JFrame{
    private JPanel panel1;
    private JTextField camporadio;
    private JButton calcularButton;
    private JLabel Volumen;
    private JLabel Superficie;

    public  VentanaEsfera(){
        setContentPane(panel1);
        setTitle("Esfera");
        setSize(280,200);
        setLocationRelativeTo(null);
        setResizable(false);

        calcularButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                boolean error =false;
                try{
                    double radio = Double.parseDouble(camporadio.
                            getText());
                    Esfera esfera = new Esfera(radio);
                    Volumen.setText("Volumen (cm3): " + String.
                            format("%.2f", esfera.calcularVolumen()));

                    Superficie.setText("Superficie (cm2): " + String.
                            format("%.2f",
                    esfera.calcularSuperficie()));


                }catch (Exception x){
                    error= true;
                }finally{
                    if (error){
                        JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número","Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        });
    }
}
