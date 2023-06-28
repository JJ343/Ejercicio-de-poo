import javax.swing.*;

public class prin {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame Miventana =new ven();
            }
        });
    }
}
