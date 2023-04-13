import javax.swing.*;

public class ej_19 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                JFrame frame =new ventana();
                frame.setSize(700,400);
                frame.setVisible(true);
                frame.setLocation(500,200);

            }
        }));
    }
}
