import javax.swing.*;

public class ejercicio_18 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new persona_v();
                frame.setSize(700,400);
                frame.setVisible(true);
            }
        });
        
    }
}
