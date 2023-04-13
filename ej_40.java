import javax.swing.*;

public class ej_40 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame pan = new ventana();
                pan.setLocation(500,200);
                pan.setVisible(true);
                pan.setSize(600,400);
            }
        });
    }
}
