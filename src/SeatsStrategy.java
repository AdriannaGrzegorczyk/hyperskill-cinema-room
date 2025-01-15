public class SeatsStrategy extends MenuStrategy{


    public SeatsStrategy (int order, String operationName){
        super(order, operationName);
    }

    @Override
    boolean executeStrategy(Board board) {

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
        System.out.println();
        return false;
    }
}
