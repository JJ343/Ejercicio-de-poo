import javax.swing.*;

public class ej_7 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ventana();
                frame.setSize(450,450);
                frame.setVisible(true);
                frame.setLocation(500,200);
            }
        });
    }
}
