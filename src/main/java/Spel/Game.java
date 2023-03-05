package Spel;

public class Game {
    private GameWindow gamewindow;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();
        gamewindow = new GameWindow(gamePanel); //Creates a gamewindow
    }
}
