package cinema;

public class BackStrategy extends MenuStrategy {

    public BackStrategy(int order, String operationName) {
        super(order, operationName);
    }

    @Override
    boolean executeStrategy(Board board) {
        return true;
    }
}
