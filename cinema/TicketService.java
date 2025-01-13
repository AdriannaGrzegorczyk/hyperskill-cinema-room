package cinema;

import java.util.Scanner;

public class TicketService {
    Scanner scanner = new Scanner(System.in);

    private int  totalIncome = 0;
    private int firstHalf = 0;
    private int backHalf = 0;

    public TicketService(){
        initCounting();
        System.exit(0);

    }

    public void initCounting() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        System.out.println("Total income:");
        if (rows * seats < 60) {
            totalIncome = (rows * seats) * 10;
            System.out.println(totalIncome);
        } else  {
            firstHalf = (rows/ 2) * 10;
            backHalf = (rows - (rows / 2)) * 8;
            totalIncome = ((firstHalf + backHalf) * seats);

        }
        System.out.print("$"+totalIncome);
    }

}
