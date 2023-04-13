import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame{
    String numero[] = new String[50];
    String raiz[] = new String[50];
    String cuadrado[]= new String[50];
    String cubo[]= new String[50];




    private JButton calcularButton;
    private JButton salirButton1;
    private JButton borrarButton;
    private JTextField Raiz;
    private JTextField Cuadrado;
    private JTextField Cubo;
    private JTextField Numero;
    private JButton guardarButton;
    private JButton buttonadelante;
    private JButton buttonatras;
    private JLabel indicetxt;
    private JPanel panel1;

    public ventana() {
    setContentPane(panel1);


        buttonadelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  indice = indicetxt.getText();
                int indi = Integer.parseInt(indice);
                if (indi<50){
                    indi= indi +1;
                    indicetxt.setText(String.valueOf(indi));

                    Numero.setText(numero[indi]);
                    Raiz.setText(raiz[indi]);
                    Cuadrado.setText(cuadrado[indi]);
                    Cubo.setText(cubo[indi]);
                }

            }
        });

        buttonatras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  indice = indicetxt.getText();
                int indi = Integer.parseInt(indice);
                if (indi>0){
                    indi= indi -1;
                    indicetxt.setText(String.valueOf(indi));

                    Numero.setText(numero[indi]);
                    Raiz.setText(raiz[indi]);
                    Cuadrado.setText(cuadrado[indi]);
                    Cubo.setText(cubo[indi]);
                }



            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  indice = indicetxt.getText();
                int indi = Integer.parseInt(indice);

                Numero.setText("");
                Raiz.setText("");
                Cubo.setText("");
                Cuadrado.setText("");

                numero[indi]= Numero.getText();
                raiz[indi]= Raiz.getText();
                cubo[indi]=Cubo.getText();
                cuadrado[indi]=Cuadrado.getText();

            }

        });
        salirButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);


            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,c,d;
                a=Double.parseDouble(Numero.getText());
                b=operaciones.raiz(a);
                c=operaciones.cuadrado(a);
                d=operaciones.cubo(a);
                Raiz.setText(String.valueOf(b));
                Cuadrado.setText(String.valueOf(c));
                Cubo.setText(String.valueOf(d));

                String  indice = indicetxt.getText();
                int indi = Integer.parseInt(indice);

                numero[indi]= Numero.getText();
                raiz[indi]= Raiz.getText();
                cubo[indi]=Cubo.getText();
                cuadrado[indi]=Cuadrado.getText();

            }
        });
    }}


