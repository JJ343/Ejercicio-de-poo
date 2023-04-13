

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {
    private JPanel panel1;
    private JTextField Radio;
    private JTextField Base_rec;
    private JTextField Alteura_rec;
    private JTextField Lado_cua;
    private JTextField lado_trian;
    private JTextField Altura_trian;
    private JButton calcularButton;
    private JButton borrarButton;
    private JButton salirButton;
    private JTextField R_area_cir;
    private JTextField R_area_rec;
    private JTextField R_area_cua;
    private JTextField R_Area_trian;
    private JTextField R_tipo_trian;
    private JTextField R_perime_cir;
    private JTextField R_perimetro_rec;
    private JTextField R_perimetro_cua;
    private JTextField R_perimetro_trian;
    private JLabel Mensaje;

    public  ventana(){
        super("Prueba de figuras");
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
                Radio.setText("");
                Base_rec.setText("");
                Alteura_rec.setText("");
                Lado_cua.setText("");
                lado_trian.setText("");
                Altura_trian.setText("");
                R_area_cir.setText("");
                R_area_rec.setText("");
                R_area_cua.setText("");
                R_Area_trian.setText("");
                R_tipo_trian.setText("");
                R_perime_cir.setText("");
                R_perimetro_rec.setText("");
                R_perimetro_cua.setText("");
                R_perimetro_trian.setText("");
                Mensaje.setText("");
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a,b,c,d,f,h;
                    a=Integer.parseInt(Radio.getText());
                    Circulo figura1 = new Circulo(a);
                    R_area_cir.setText(String.valueOf(figura1.calcularArea()));
                    R_perime_cir.setText(String.valueOf(figura1.calcularPerimetro()));
                    b= Integer.parseInt(Base_rec.getText());
                    c=Integer.parseInt(Alteura_rec.getText());
                    Rectangulo figura2 = new Rectangulo(b,c);
                    R_area_rec.setText(String.valueOf(figura2.calcularArea()));
                    R_perimetro_rec.setText(String.valueOf(figura2.calcularPerimetro()));
                    d=Integer.parseInt(Lado_cua.getText());
                    Cuadrado figura3=new Cuadrado(d);
                    R_area_cua.setText(String.valueOf(figura3.calcularArea()));
                    R_perimetro_cua.setText(String.valueOf(figura3.calcularPerimetro()));
                    f= Integer.parseInt(lado_trian.getText());
                    h= Integer.parseInt(Altura_trian.getText());
                    Triangulorectangulo figura4= new Triangulorectangulo(f,h);
                    R_Area_trian.setText(String.valueOf(figura4.calcularArea()));
                    R_perimetro_trian.setText(String.valueOf(figura4.calcularPerimetro()));

                    R_tipo_trian.setText(figura4.determinarTipoTriangulo());





                }
                catch (NumberFormatException X){
                    Mensaje.setText("Te faltan datos o estan mal ingresados");
                }


            }
        });
    }
}
