//package Models.Potential_models;
//
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

public class Pane extends JPanel{
    private String name;

    public Pane(String name){
        this.name = name;
    }

    /**
     * Put the image on the screen
     * @param g : the Graphical object that will allow to print the file
     */
    public void paintComponent(Graphics g){
        try
        {
            Image img = ImageIO.read(new File(this.name));
            g.drawImage(img, 0, 0, this);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
