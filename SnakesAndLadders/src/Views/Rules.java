package Views;

import javax.swing.*;

public class Rules extends JPanel {

    private String rulesText;
    private JTextArea textArea;

    public Rules() {

        this.rulesText = getRules();
        this.textArea = new JTextArea(rulesText, 15, 40); //put it in a textarea to be able to wrap the text easily
        textArea.setLineWrap(true); //make it look like a label
        textArea.setEditable(false);
        textArea.setBorder(null);
        textArea.setOpaque(false);
        textArea.setWrapStyleWord(true);

        this.add(textArea);
        this.setBorder(null);
        this.setVisible(true);

    }

    /**
     * get the rules
     * @return the string comporting the rules of the game
     */
    private static String getRules() {
        return "The game of Snakes and Ladders is for 2 to 6 players and is played on a board with a definite number of spaces, numbered 1 to 100. \n"
                + "Play begins on square number 1 at the bottom left-hand corner of the board and finishes on the last space of the board. \n"
                + "\n"
                + "Players take turns to roll a dice and move along the number of spaces rolled if they correctly answer a question. \n"
                + "If a player lands on a square which has the base of a ladder upon it then they automatically advance their position by moving up to the top of the ladder. \n"
                + "Similarly if a player lands on a square which has the head of a snake upon it then the player must automatically follow down to the tail of the snake thereby losing position. \n"
                + "\n"
                + "The winner is the player who is first to land on the last space. \n"
                + "You must roll the exact number needed to land on." ;
    }
}
