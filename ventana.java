import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {
    private JTextField Nombre;
    private JTextField Salario;
    private JTextField Horas_trabajadas;
    private JTextField Resultado;
    private JLabel Mensaje;
    private JButton borrarButton;
    private JButton consultarButton;
    private JButton salirButton;
    private JPanel panel1;

    public  ventana(){
        super("Ej_22");
        setContentPane(panel1);


        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre.setText("");
                Salario.setText("");
                Horas_trabajadas.setText("");
                Resultado.setText("");
                Mensaje.setText("");


            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String x,d;
                    Double a,b,c;
                    x= Nombre.getText();
                    a=Double.parseDouble(Salario.getText());
                    b=Double.parseDouble(Horas_trabajadas.getText());
                    c=algoritmo.valor(a,b);
                    d=algoritmo.trabajo(x,c);
                    Resultado.setText(String.valueOf(d));
                    Mensaje.setText("");
                }
                catch (NumberFormatException X){
                    Mensaje.setText("Te faltan datos o estan mal ingresados");
                }

            }
        });
    }
}
