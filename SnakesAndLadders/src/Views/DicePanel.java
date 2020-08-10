package Views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DicePanel extends JPanel {

    public DicePanel() {
        try {
            BufferedImage dicePic = ImageIO.read(new File("./resources/pictures/diceToRoll.png"));
            dicePic = scale(dicePic, 0.1);
            JLabel picLabel = new JLabel(new ImageIcon(dicePic));
            this.add(picLabel);
        } catch (IOException ex) {
            System.out.println("Can't display the dice picture");
        }

        JButton button = new JButton("Roll the dice!");
        this.add(button);

    }

    public static BufferedImage scale(BufferedImage bi, double scaleValue) {
        AffineTransform tx = new AffineTransform();
        tx.scale(scaleValue, scaleValue);
        AffineTransformOp op = new AffineTransformOp(tx,
                AffineTransformOp.TYPE_BILINEAR);
        BufferedImage biNew = new BufferedImage( (int) (bi.getWidth() * scaleValue),
                (int) (bi.getHeight() * scaleValue),
                bi.getType());
        return op.filter(bi, biNew);

    }
}
