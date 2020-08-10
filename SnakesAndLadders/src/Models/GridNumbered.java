package Models;

public class GridNumbered {

    private String[][] grid;

    private final int height;
    private final int width;

    public GridNumbered(int w, int h) {

        // initialization
        this.height = h;
        this.width = w;

        this.grid = new String[h][w];

        // fill the grid with number for the gameplay
        this.fill_grid();
    }

    /**
     * fill the grid (double area of string) with increasing number according to the game board
     * needed to create a view of the grid
     */
    public void fill_grid() {

        int posY = 0, posX = 0; // positions of the first space to be filled

        for (int y = this.height-1 ; y >= 0 ; y-- ) { // each line

            // differenciation to be able to go increase or decrease on a line
            if (y % 2 == 0) {

                for (int x = 1 ; x < this.width+1 ; x++) { // each space

                    grid[posY][posX] = ((x + width * y) + "");
                    posX++;
                }
            } else {

                for (int x = this.width ; x > 0 ; x-- ) { // each space

                    grid[posY][posX] = ((x + width * y) + "");
                    posX++;
                }
            }

            posY++;
            posX=0;
        }
    }

    /**
     * get the grid
     * @return the grid already numbered
     */
    public String[][] getGrid() {
        return this.grid;
    }
}