import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ventana extends JFrame {
    private JPanel panel1;
    private JTextField Numero;
    private JButton calcularButton;
    private JTextField Valor_mayor;
    private JButton salirButton;
    private JButton borrarButton;
    private JButton agregarButton;
    private JLabel Mensaje;
    private JLabel Lista;
    public static  Double mayor=-10000000.0;

    public ventana(){
        super("mayor");
        setContentPane(panel1);
        List<Double> Numeros;
        Numeros = new ArrayList<>();



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
                Numero.setText("");
                Valor_mayor.setText("");
                Numeros.clear();
                Lista.setText("");
                mayor=-10000000.0;
                Mensaje.setText("");


            }

        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    List c;
                    double a, b;
                    a=Integer.parseInt(String.valueOf(Numero.getText())) ;
                    Numeros.add(a);
                    c=Numeros;
                    mayor=mayor_que.mayor(a,mayor);
                    Lista.setText(String.valueOf(c));
                    Numero.setText("");

                }
                catch (NumberFormatException X){
                    Mensaje.setText("Digite un numero porfavor");
                }


            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mayor>-10000000.0){
                    Valor_mayor.setText(String.valueOf(mayor));
                }else {
                    Mensaje.setText("Digite un numero porfavor");
                }


            }
        });
    }}

