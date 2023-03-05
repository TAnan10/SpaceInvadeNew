package Spel;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        jframe = new JFrame();
        jframe.setSize(400, 400); //The size of the game window (Width, Height)
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes the program when you close the window
        jframe.add(gamePanel); //Adds the panel onto the frame, makes what you drew on the panel visible in the frame
        jframe.setVisible(true); //Makes the gamewindow visible (Has to be at the bottom of the code)
    }
}
