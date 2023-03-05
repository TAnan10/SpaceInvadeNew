package Spel;

import java.awt.Graphics; // Graphics allows the user to actually draw artifacts onto the window, the window class makes sure there is a window to draw onto
import javax.swing.JPanel;

public class GamePanel extends JPanel{

    public GamePanel() {

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g); //Has to be called in order to clear the canvas

        g.fillRect(100, 100, 200, 50);
    }
}
