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
        textUI.printRoom(board);
        return board;
    }

    public void initCounting(Board board) {
        System.out.println("Enter a row number:");
        int row = scanner.nextInt();
        ;
        System.out.println("Enter a seat number in that row:");
        int col = scanner.nextInt();


        if (row <= 4) {
            ticketPrice = 10;
            System.out.println("Ticket price: " + "$" + ticketPrice);
        } else {
            ticketPrice = 8;
            System.out.println("Ticket price: " + "$" + ticketPrice);
        }
        System.out.println();
        TextUI textUI = new TextUI();
        board.getSeats()[row-1][col-1]='B';
        textUI.printRoom(board);

    }
}

