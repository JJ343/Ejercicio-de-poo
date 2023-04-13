import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame{
    private JLabel Mensaje;
    private JLabel ab;
    private JTextField Resultado;
    private JTextField C;
    private JTextField B;
    private JTextField A;
    private JButton borrarButton;
    private JButton salidaButton;
    private JButton calcularButton;
    private JPanel panel1;

    public ventana(){
        super("Ax^2+Bx+C");
        setContentPane(panel1);


        salidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText("");
                A.setText("");
                B.setText("");
                C.setText("");
                Mensaje.setText("");

            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a,b,c,d,f;
                    a=Double.parseDouble(A.getText());
                    b=Double.parseDouble(B.getText());
                    c=Double.parseDouble(C.getText());
                    d=cuadratica.ecuacion_p(a,b,c);
                    f=cuadratica.ecuacion_n(a,b,c);
                    Resultado.setText("Las raices de la ecuacion son: r1="+d+ " y r2="+f);
                }
                catch (NumberFormatException X){
                    Mensaje.setText("Te faltan datos o estan mal ingresados");

                }
            }
        });
    }
}
