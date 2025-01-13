package cinema;

import java.util.Arrays;

public class Board {

    private final char[][] seats;
    public  int row;
    public int col;


    public Board (int row, int col){
        this.col= col;
        this.row=row;
        this.seats = new char[row][col];
        for (char [] rowArr : seats){
            Arrays.fill(rowArr,'S');
        }
    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public char[][] getSeats() {
        return seats;
    }
}
