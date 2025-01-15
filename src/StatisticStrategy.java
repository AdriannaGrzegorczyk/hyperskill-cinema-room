public class StatisticStrategy extends MenuStrategy {

    public StatisticStrategy(int order, String operationName) {
        super(order, operationName);
    }

    @Override
    boolean executeStrategy(Board board) {
        int purchasedTickets = numberOfTickets(board);
        System.out.printf("Number of purchased tickets:%d\n" +
                        "Percentage: %.2f%%\n" +
                        "Current income: $%d\n" +
                        "Total income: $%d\n\n",
                purchasedTickets, convertToPercentage(purchasedTickets, board), countCurrentIncome(board), totalIncome(board));
        return false;
    }

    public int totalIncome(Board board) {
        int totalIncome = 0;
        if (board.getRow() * board.getCol() < 60) {
            totalIncome = (board.getRow() * board.getCol()) * 10;
            System.out.println(totalIncome);
        } else {
            int firstHalf = (board.getRow() / 2) * 10;
            int backHalf = (board.getRow() - (board.getRow() / 2)) * 8;
            totalIncome = ((firstHalf + backHalf) * board.getCol());
        }
        return totalIncome;
    }

    public int numberOfTickets(Board board) {
        int purchasedTickets = 0;
        for (int row = 1; row <= board.getRow(); row++) {
            for (int col = 1; col <= board.getCol(); col++) {
                if (board.getSeats()[row - 1][col - 1] == Board.OCCUPIED_SEAT) {
                    purchasedTickets++;
                }
            }
        }
        return purchasedTickets;
    }

    public int countCurrentIncome(Board board) {
        return board.getCurrentIncome();
    }

    public float convertToPercentage(int purchasedTickets, Board board) {
        return (float) purchasedTickets / (board.getRow() * board.getCol()) * 100;
    }
}
