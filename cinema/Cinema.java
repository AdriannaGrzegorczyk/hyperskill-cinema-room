package cinema;


import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MainMenuStrategyProvider provider = new MainMenuStrategyProvider();

        Board board = new Board();
        while (true) {

            provider.printMenu();
            int numberFromMenu = scanner.nextInt();
            boolean flag = provider.executeProvider(numberFromMenu, board);

            if (flag) {
                break;
            }
        }
    }
}