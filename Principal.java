import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                JFrame Miventana =new VentanaPrincipal();
                Miventana.setVisible(true);
            }
        });
    }
}
