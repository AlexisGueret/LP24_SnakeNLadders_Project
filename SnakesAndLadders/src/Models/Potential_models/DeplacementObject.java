package Models.Potential_models;

public abstract class DeplacementObject{
	protected int activatePosition;
	protected int deplacePosition;

	public DeplacementObject(int activate, int deplace) {
        this.activatePosition = activate;
        this.deplacePosition = deplace;

	}

    /**
     * Checks if a player is on a snake or ladder "turn" position
     * If so, return true, else, return false;
     * @param p: a player
     */
    public boolean isOnActivatePosition(Player p){
        if(p.getPosition() == this.activatePosition)
            return true;
        else
            return false;
    }
    /**
     * Checks if a player have answer right to a question or not after going on a "turn" position
     * @param p: a player
     * @param test: a boolan whose value is true if the player answer right, false else
     */
    public void movePlayer(Player p, boolean test){
        if(test){
            p.move(deplacePosition);
        }
    }
}
