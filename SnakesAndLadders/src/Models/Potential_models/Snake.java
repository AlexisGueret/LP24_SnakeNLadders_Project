//package Models.Potential_models;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

public class Snake extends DeplacementObject {

    private Pane snake;

    public Snake(int activate, int deplace){
        super(activate, deplace);
        this.snake = new Pane("./Initialisation/snake.jpg");
    }
}
