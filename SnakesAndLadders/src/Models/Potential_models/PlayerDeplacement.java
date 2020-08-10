//package Models.Potential_models;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.ArrayList;

public class PlayerDeplacement
{
    private ArrayList<JButton> buttonList;

    public PlayerDeplacement(ArrayList<JButton> list){
        this.buttonList = new ArrayList<>(list);
    }

    /**
     * Put the token of a player to the associated button
     * @param playerList an ArrayList that contains the players
     * @param diceValue the valueof the dice
     */
    public void deplacement(Player player, int diceValue){
        if(player.getPosition() + diceValue > this.buttonList.size()){
            unfillButton(player.getPosition());
            player.setPosition((this.buttonList.size() + (this.buttonList.size() - player.getPosition())) - diceValue);
        }
        else{
            unfillButton(player.getPosition());
            player.move(diceValue);
        }
        fillButton(player);
    }

    /**
     * Fill a button with a token of a player
     * @param player the  player that we will use to fill the button
     */
    public void fillButton(Player player){
        this.buttonList.get(player.getPosition()).setIcon(player.getToken());
    }

    /**
     * Unfill the button with the position of a player
     * @param position the position we will use to unfill the button
     */
    public void unfillButton(int position){
        this.buttonList.get(position).setIcon(null);
    }
}
