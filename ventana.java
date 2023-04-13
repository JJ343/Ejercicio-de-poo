import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends  JFrame{
    private JPanel panel1;
    private JTextField Numero_matricula;
    private JTextField Nombres;
    private JTextField Patrimonios;
    private JTextField Estrato_social;
    private JTextField Resultado;
    private JButton salirButton;
    private JButton consultarButton;
    private JButton borrarButton1;
    private JLabel Mensaje;

    public ventana(){
        super("ej_10");
        setContentPane(panel1);

        borrarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Numero_matricula.setText("");
                Nombres.setText("");
                Patrimonios.setText("");
                Estrato_social.setText("");
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
                    String x,y;
                    int b;
                    double a,c;
                    x=Numero_matricula.getText();
                    y=Nombres.getText();
                    a = Double.parseDouble(Patrimonios.getText());
                    b=Integer.parseInt(Estrato_social.getText());
                    c=universidad.pagar(a,b);
                    Resultado.setText("EL ESTUDIANTE CON NUMERO DE  INSCRIPCION "+ x+ " Y NOMBRE " + y+ " DEBE PAGAR $"+String.valueOf(c));
                    Mensaje.setText("");

                }
                catch (NumberFormatException X){
                    Mensaje.setText("Te faltan datos o estan mal ingresados");
                }
            }
        });
    }
}
