import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanapiramide extends  JFrame{
    private JPanel panel1;
    private JTextField Base;
    private JTextField Altura;
    private JTextField Apotema;
    private JButton calcularButton;
    private JLabel Volumen;
    private JLabel Superficie;

    public Ventanapiramide() {
        setContentPane(panel1);
        setTitle("Piramide");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setResizable(false);


        calcularButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                Piramide piramide;
                boolean error = false;
                double base = 0;
                double altura = 0;
                double apotema = 0;
                try {
                    base = Double.parseDouble(Base.getText());

                    altura = Double.parseDouble(Altura.getText());

                    apotema = Double.parseDouble(Apotema.getText());

                    piramide = new Piramide(base, altura, apotema);

                    Volumen.setText("Volumen (cm3): " + String.format("%.2f",
                            piramide.calcularVolumen()));

                    Superficie.setText("Superficie (cm2): " + String.format("%.2f",
                            piramide.calcularSuperficie()));
                } catch (Exception x) {
                    error = true;
                } finally {
                    if (error) {
                        JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error",JOptionPane.ERROR_MESSAGE);
                    }}
            }
        });
    }
}
