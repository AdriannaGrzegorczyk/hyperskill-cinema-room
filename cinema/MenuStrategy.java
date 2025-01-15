package cinema;

import java.awt.*;

public abstract class MenuStrategy {

    protected int order;

    protected String operationName;

    public MenuStrategy(int order, String operationName) {

        this.order = order;
        this.operationName = operationName;

    }


    abstract boolean executeStrategy(Board board);


    @Override
    public String toString() {

        return order + ". " + operationName;

    }

}
