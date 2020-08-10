import Views.Window;

import javax.swing.*;

public class SnakesAndLadders {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
             public void run() {
                new Window();
            }
        });
    }
}