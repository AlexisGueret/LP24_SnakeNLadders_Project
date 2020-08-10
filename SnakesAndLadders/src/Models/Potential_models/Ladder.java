//package Models.Potential_models;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

public class Ladder extends DeplacementObject {

    private Pane ladder;

    public Ladder(int activate, int deplace){
        super(activate, deplace);
        this.ladder = new Pane("ladder.jpg");
    }
}
