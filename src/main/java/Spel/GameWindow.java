package Spel;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {

        jframe = new JFrame();

        jframe.setSize(600, 600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }

}


