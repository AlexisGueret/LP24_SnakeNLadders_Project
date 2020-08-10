package Models.Potential_models;

public class Dice {
	private int value;
	private int nbSides = 6;
	
	public int roll(){
		this.value = (int) (Math.random() * nbSides) + 1;
		return this.value;
	}
}