package cinema;


import java.util.Scanner;

public class TicketService {
    Scanner scanner = new Scanner(System.in);
    private int totalIncome = 0;
    private int firstHalf = 0;
    private int backHalf = 0;
    private int ticketPrice = 0;

    public Board createBoard() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();

        TextUI textUI = new TextUI();
        Board board = new Board(rows, col);
        return board;


    }
    public void printRoom(Board board) {

        System.out.println("Cinema:");

        for (int i = 1; i<= board.getCol(); ++i){
            System.out.print(" "+i);
        }
        System.out.println();

        for(int i = 0; i<board.getRow(); ++i){
            System.out.print(i+1);
            for (int j = 0; j< board.getCol(); ++j){
                System.out.print(" " + board.getSeats()[i][j]);
            }
            System.out.println();
        }

    }

}

