package Views;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Models.GridNumbered;

public class GlobalContent extends JPanel {

    protected GridPanel gridPanel;

    public GlobalContent(int height, int width) {

        this.add(this.getHeader());

        gridPanel = new GridPanel(height, width);
        this.add(gridPanel);

        this.add(new DicePanel());

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //add the component on a Y basis
        this.setBorder(BorderFactory.createEmptyBorder(10, 30, 20, 30)); //add a gap between the panel and the frame

    }

    /**
     * create a header to display in top of the frame
     * @return a panel comporting the label (the header so)
     */
    public JPanel getHeader() {

        JLabel jlab = new JLabel("Wanna play a Snake and Ladders game ?", JLabel.CENTER);
        jlab.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel jp = new JPanel();
        jp.add(jlab);

        return jp;
    }
}