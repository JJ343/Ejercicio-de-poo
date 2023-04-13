import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends  JFrame {
    private JPanel panel1;
    private JLabel numero_1;
    private JTextField Numero_1;
    private JTextField Numero_2;
    private JButton calcularButton;
    private JButton borrarButton;
    private JTextField Resultado;
    private JButton salirButton;
    private JLabel Mensaje;

    public  ventana(){
        super("Mayor que");
        setContentPane(panel1);


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Numero_1.setText("");
                Numero_2.setText("");
                Resultado.setText("");
                Mensaje.setText("");

            }
        });

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String c;
                    double a,b;
                    a=Double.parseDouble(Numero_1.getText());
                    b=Double.parseDouble(Numero_2.getText());
                    c=Mayor_que.mayor(a,b);
                    Resultado.setText(c);
                    Mensaje.setText("");

                }
                catch (NumberFormatException X){
                    Mensaje.setText("Te faltan datos o estan mal ingresados");
                }
            }
        });
    }
}

