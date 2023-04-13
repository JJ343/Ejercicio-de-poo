import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends  JFrame {
    private JPanel panel1;
    private JTextField Lado;
    private JTextField Perimetro;
    private JTextField Altura;
    private JTextField Area;
    private JButton calcularButton;
    private JButton borrarButton;
    private JButton salirButton;
    private JLabel mensaje;

    public  ventana(){
        super("Triangulo equilatero");
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
                Lado.setText("");
                Perimetro.setText("");
                Altura.setText("");
                Area.setText("");
                mensaje.setText("");
            }
        });

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a,b,c,d,f,g,h,j;
                    a=Double.parseDouble(Lado.getText());
                    b=Triangulo_equilatero.perimetro(a);
                    c=Triangulo_equilatero.area(a);
                    d=Triangulo_equilatero.altura(a);
                    Perimetro.setText(String.valueOf(b));
                    Area.setText(String.valueOf(c));
                    Altura.setText(String.valueOf(d));
                    mensaje.setText("");
                }
                catch (NumberFormatException X){
                    mensaje.setText("Te faltan datos o estan mal ingresados");
                }

            }
        });
    }
}
