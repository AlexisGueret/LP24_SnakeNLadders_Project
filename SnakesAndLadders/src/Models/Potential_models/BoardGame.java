package Models.Potential_models;

public class BoardGame {
	private int rowNumber;
	private int columnNumber;
	private int spaceNumber;
	private Snakes allSnakes;
	private Ladders allLadders;

	public BoardGame(int rowNumber, int columnNumber, int specialNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
		this.spaceNumber = this.columnNumber * this.rowNumber;
		this.allSnakes = new Snakes(specialNumber);
		this.allLadders = new Ladders(specialNumber);
	}
}