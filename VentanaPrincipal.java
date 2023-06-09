import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{

    private JPanel ventana;
    private JTextField Notas_1;
    private JTextField Notas_2;
    private JTextField Notas_3;
    private JTextField Notas_4;
    private JTextField Notas_5;
    private JButton calcularButton;
    private JButton limpiarButton;
    private JLabel Nota_1;
    private JLabel Nota_2;
    private JLabel Promedio;
    private JLabel Desviacion;
    private JLabel Valor_mayor;
    private JLabel Valor_menor;

    public  VentanaPrincipal(){
        setContentPane(ventana);
        setTitle("Notas");
        setSize(280,380);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Notas notas = new Notas();
                notas.listaNotas[0] = Double.parseDouble(Notas_1.
                        getText());

                notas.listaNotas[1] = Double.parseDouble(Notas_2.
                        getText());

                notas.listaNotas[2] = Double.parseDouble(Notas_3.
                        getText());

                notas.listaNotas[3] = Double.parseDouble(Notas_4.
                        getText());
                notas.listaNotas[4] = Double.parseDouble(Notas_5.
                        getText());


                notas.calcularPromedio();
                notas.calcularDesviación();
                double desv = notas.calcularDesviación();
                Promedio.setText("Promedio = " + String.valueOf(String.
                                format("%.2f", notas.calcularPromedio())));


                Desviacion.setText("Desviación estándar = " + String.
                        format("%.2f", desv));

                Valor_mayor.setText("Valor mayor = " + String.valueOf(notas.
                        calcularMayor()));

                Valor_menor.setText("Valor menor = " + String.valueOf(notas.
                        calcularMenor()));


            }

        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Promedio.setText("Promedio = ");
                Desviacion.setText("Desviación estándar = ");
                Valor_mayor.setText("Valor mayor = ");
                Valor_menor.setText("Valor menor = ");
                Notas_1.setText("");
                Notas_2.setText("");
                Notas_3.setText("");
                Notas_4.setText("");
                Notas_5.setText("");

            }
        });
    }
}
