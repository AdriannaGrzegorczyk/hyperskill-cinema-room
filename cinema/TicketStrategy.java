package cinema;

import java.util.Scanner;

public class TicketStrategy extends MenuStrategy {
Scanner scanner = new Scanner(System.in);

public TicketStrategy (int order, String operationName){
        super(order, operationName);

    }

    @Override
    boolean executeStrategy(Board board) {

    int ticketPrice=0;
        while (true) {
            System.out.println("Enter a row number:");
            int row = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            int col = scanner.nextInt();

            if (board.getRow()<row || board.getCol()<col){
                System.out.println("Wrong input!");
            } else  if (board.getSeats()[row - 1][col - 1] != 'B') {
                if (row <= 4) {
                    ticketPrice = 10;
                    System.out.println("Ticket price: " + "$" + ticketPrice);
                } else {
                    ticketPrice = 8;
                    System.out.println("Ticket price: " + "$" + ticketPrice);
                }
                System.out.println();

                board.getSeats()[row - 1][col - 1] = 'B';
                CinemaUI.printRoom(board);

                board.currentIncome+=ticketPrice;
                return false;
            } else {
                System.out.println("That ticket has already been purchased!");
                System.out.println();
            }
        }
    }
}
