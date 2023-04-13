import javax.swing.*;

public class ej_41 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame pan= new ventana();
                pan.setSize(600,400);
                pan.setVisible(true);
                pan.setLocation(500,200);

            }
        });
    }
}
