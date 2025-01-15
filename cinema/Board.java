package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Board {

    static final char OCCUPIED_SEAT = 'B';
    static final char FREE_SEAT = 'S';
    private final char[][] seats;
    private int row;
    private int col;
    private int currentIncome = 0;

    public Board() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();

        this.col = col;
        this.row = rows;
        this.seats = new char[row][col];
        for (char[] rowArr : seats) {
            Arrays.fill(rowArr, FREE_SEAT);
        }

    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public char[][] getSeats() {
        return seats;
    }

    public void setCurrentIncome(int currentIncome) {
        this.currentIncome = currentIncome;
    }
}
