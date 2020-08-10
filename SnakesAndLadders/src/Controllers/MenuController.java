package Controllers;

import Views.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    protected Window window;

    public MenuController(Window window) {
        this.window = window;
    }

    /**
     * set the reaction depending on the button used on the menu
     * @param actionEvent we check its source to know which button was pressed in the menu
     */
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == window.closeItem) {
            System.exit(0);
        }

        if (actionEvent.getSource() == window.rulesItem) {
            JOptionPane.showMessageDialog(null, window.rulesScrollPane, "Game rules", JOptionPane.INFORMATION_MESSAGE);
        }

        if (actionEvent.getSource() == window.playItem) {

            String[] grid = {"54 spaces", "77 spaces", "104 spaces"};

            JOptionPane jop = new JOptionPane();
            String choice = (String)jop.showInputDialog(null, "Which grid do you want ?", "Grid settings", JOptionPane.QUESTION_MESSAGE, null, grid, grid[0]);

            switch (choice) {
                case "54 spaces":
                    window.gridWidth = 6;
                    window.gridHeight = 9;
                    break;

                case "77 spaces":
                    window.gridWidth = 7;
                    window.gridHeight = 11;
                    break;

                case "104 spaces":
                    window.gridWidth = 8;
                    window.gridHeight = 13;
                    break;
            }

            window.update(); //update the grid to the new size and the window to the new grid
        }
    }
}
