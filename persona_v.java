import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class persona_v extends JFrame{
    private JPanel panel1;
    private JTextField Nombre;
    private JTextField Valor_h;
    private JTextField N_horas;
    private JTextField Retencion;
    private JTextField Codigo;
    private JTextField R_codigo;
    private JTextField R_nombre;
    private JTextField R_salariobruto;
    private JTextField R_salarioneto;
    private JButton calcularButton;
    private JButton borrarButton;
    private JButton salirButton;
    private JLabel mensaje;


    public  persona_v(){
        super ("Ejercicio 18");
        setContentPane(panel1);


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);

            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String x, y;
                    double a, b, c,d,f,g;
                    x=Nombre.getText();
                    R_nombre.setText(String.valueOf(x));
                    y=Codigo.getText();
                    R_codigo.setText(String.valueOf(y));
                    a=Double.parseDouble(N_horas.getText());
                    b=Double.parseDouble(Valor_h.getText());
                    d=persona.salario_bruto(a,b);
                    R_salariobruto.setText(String.valueOf(d));
                    c=Double.parseDouble(Retencion.getText());
                    f=persona.retencion(d,c);
                    g=persona.salario_neto(d,f);
                    R_salarioneto.setText(String.valueOf(g));
                    mensaje.setText("");
                }
                catch (NumberFormatException X){
                    mensaje.setText("Te faltan datos o estan mal ingresados");



                }




            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre.setText("");
                Codigo.setText("");
                N_horas.setText("");
                Valor_h.setText("");
                Retencion.setText("");
                R_nombre.setText("");
                R_codigo.setText("");
                R_salariobruto.setText("");
                R_salarioneto.setText("");
                mensaje.setText("");
            }
        });
    }

}
