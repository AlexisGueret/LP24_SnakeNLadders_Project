//package Models.Potential_models;

import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Player {
	private String name;
	private ImageIcon token;
	private int position = 1;

	public Player(String name, String token) {
		this.name = name;
		this.token = new ImageIcon(token);
	}

    /**
     * Returns the name of the player
     */
	public String getName() {
		return this.name;
	}

    /**
     * Returns the position of a player
     */
	public int getPosition() {
        return this.position;
	}

    /**
     * Set the position of a player to the value in parameter
     * Use when the player is at the end, and when its position + the dice score is over the number of cases
     * @param position the position that we will use to set the player position
     */
    public void setPosition(int position){
        this.position = position;
    }

    /**
     * Change the position index of the player
     */
	public void move(int diceValue) {
		this.position += diceValue;
	}

    /**
     * return the token of a player
     */
    public ImageIcon getToken(){
        return this.token;
    }

}
