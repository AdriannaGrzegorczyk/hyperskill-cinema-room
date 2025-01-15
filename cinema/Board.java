package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Board {

    private final char[][] seats;
    public  int row;
    public int col;
    public int currentIncome =0;

    public Board (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();

        this.col= col;
        this.row=rows;
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
