import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame {
    private JPanel Ventanacilindro;
    private JTextField camporadio;
    private JTextField campoaltura;
    private JButton calcularButton;
    private JLabel Volumen;
    private JLabel Superficie;

    public VentanaCilindro(){
        setContentPane(Ventanacilindro);
        setTitle("cilindro");
        setSize(280,210);
        setLocationRelativeTo(null);
        setResizable(false);

        calcularButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                boolean error =false;
                double radio=0;
                double altura=0;
                try{
                    radio =Double.parseDouble(camporadio.getText());
                    altura=Double.parseDouble(campoaltura.getText());

                    Cilindro cilindro = new Cilindro(radio,altura);


                    Volumen.setText("Volumen (cm3): " + String.format("%.2f",
                    cilindro.calcularVolumen()));

                    Superficie.setText("Superficie (cm2): " + String.format("%.2f",
                    cilindro.calcularSuperficie()));


                } catch(Exception x){
                    error= true;

                } finally {
                    if (error){
                        JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero", "error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        });
    }
}
