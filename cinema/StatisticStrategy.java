package cinema;

public class StatisticStrategy extends MenuStrategy {


    int totalIncome = 0;
    int purchasedTickets = 0;

    public StatisticStrategy(int order, String operationName) {
        super(order, operationName);
    }

    @Override
    boolean executeStrategy(Board board) {
        System.out.printf("Number of purchased tickets:%d\n" +
                        "Percentage: %.2f%%\n" +
                        "Current income: $%d\n" +
                        "Total income: $%d\n\n",
                numberOfTickets(board), convertToPercentage(board), countCurrentIncome(board), totalIncome(board));
        return false;
    }
    public int totalIncome(Board board) {
        int firstHalf = 0;
        int backHalf = 0;
        if (board.getRow() * board.getCol() < 60) {
            totalIncome = (board.getRow() * board.getCol()) * 10;
            System.out.println(totalIncome);
        } else {
            firstHalf = (board.getRow() / 2) * 10;
            backHalf = (board.getRow() - (board.getRow() / 2)) * 8;
            totalIncome = ((firstHalf + backHalf) * board.getCol());
        }
        return totalIncome;
    }
    public int numberOfTickets(Board board) {

        purchasedTickets=0;
        for (int row = 1; row <= board.getRow(); row++) {
            for (int col = 1; col <= board.getCol(); col++) {
                if (board.getSeats()[row - 1][col - 1] == 'B') {
                    purchasedTickets++;
                }
            }
        }
        return purchasedTickets;
    }
    public int countCurrentIncome (Board board){
        return board.currentIncome;

    }

    public float convertToPercentage (Board board){
        return (float) purchasedTickets/ (board.getRow() * board.getCol()) *100;

    }
}
