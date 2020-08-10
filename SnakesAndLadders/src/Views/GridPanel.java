package Views;

import Models.GridNumbered;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class GridPanel extends JPanel{

    private ArrayList buttonList;

    public GridPanel(int height, int width) {
        this.gridInit(height, width);
    }

    /**
     * create a numbered grid of buttons-or labels
     * @param height describe the number of rows in the grid
     * @param width describe the number of columns in the grid
     * @return a panel comporting the desired grid
     */
    public void gridInit(int height, int width) {

        this.buttonList = new ArrayList<JButton>();
        this.setLayout(new GridLayout(height, width)); //divide the panel into h rows and w columns

        GridNumbered ng = new GridNumbered(width, height); //get the numbered grid corresponding to this size
        String[][] string = ng.getGrid();

        for (String[] str : string) {

            for (String s : str) {

                //With JLabels---------
                /*JLabel label = new JLabel(s, JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                gridPanel.add(label);*/


                // With JButtons----------
                JButton button = new JButton(s);
                button.setFocusPainted(false);
                button.setContentAreaFilled(false);
                button.setEnabled(false);
                button.setBorder(new LineBorder(Color.BLACK));
                UIManager.getDefaults().put("Button.disabledText",Color.BLACK);

                this.add(button);
                this.buttonList.add(button); //add the button to the list

            }
        }

        this.setPreferredSize(new Dimension(60*width, 40*height));
    }

    /**
     * update, modify the grid, according to a new number of spaces
     * @param height new number of rows
     * @param width new number of columns
     */
    public void update(int height, int width) {

        this.removeAll(); //remove the old elements which aren't needed anymore
        this.gridInit(height, width); //replace it by a new one
        this.revalidate(); //validate the new display
        this.repaint();
        this.buttonList.clear(); //clean the list of buttons
    }

    /**
     * return the list of buttons inside the grid
     */
    public ArrayList<JButton> getButtonList(){
        return this.buttonList;
    }
}
