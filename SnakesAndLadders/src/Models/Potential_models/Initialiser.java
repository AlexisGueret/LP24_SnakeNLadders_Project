//package Models.Potential_models;

import java.util.*;
import java.io.*;

public class Initialiser{
    private Scanner init;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;
    private String name;

    /**
     * Will call a method that will fill the grid with a specific number of objects according to the size of te grid
     * @param gridNumber : the size of the grid
     * @param numberOfTurns : the number of turns
     */
    public Initialiser(int gridNumber, int numberOfTurns){
        this.snakes = new ArrayList<Snake>();
        this.ladders = new ArrayList<Ladder>();
        this.name = new String("./Initialisation/snakeNladder" + gridNumber + "Game" + numberOfTurns + ".txt");
        try
        {
            if(gridNumber == 1){
                this.init = new Scanner(new FileInputStream(this.name));
                fillGridWithObjects(4); // 4 is the number of snakes and ladders per grid

            }
            else if(gridNumber == 2){
                this.init = new Scanner(new FileInputStream(this.name));
                fillGridWithObjects(6);
            }
            else if(gridNumber == 3){
                this.init = new Scanner(new FileInputStream(this.name));
                fillGridWithObjects(8);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Put the adapted number of snakes and ladders according to the sizeof the grid
     * For that, this function will fill two Lists of Snake and Ladder objects
     * The positions of those objects will change every two turns
     * @param objNumber : the number of snakes and also the number of ladders
     */
    public void fillGridWithObjects(int objNumber){
        int i = 0;
        try
        {
            while(this.init.hasNextInt() && i != objNumber){
                this.snakes.add(new Snake(this.init.nextInt(), this.init.nextInt()));
                i = i + 1;
            }
            while(this.init.hasNextInt()){
                this.ladders.add(new Ladder(this.init.nextInt(), this.init.nextInt()));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Clear the list, use at the end of the game or every 8 turns
     */
    public void clear(){
        this.snakes.clear();
        this.ladders.clear();
    }
    /**
     * Returns the list of snakes
     */
    public ArrayList<Snake> getSnakes(){
        return this.snakes;
    }
    /**
     * Returns the list of ladders
     */
    public ArrayList<Ladder> getLadders(){
        return this.ladders;
    }
}
