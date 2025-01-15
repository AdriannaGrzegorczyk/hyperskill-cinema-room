package cinema;

import java.util.List;
import java.util.Optional;

public class MainMenuStrategyProvider {


    List<MenuStrategy> options = List.of(
            new SeatsStrategy(1,"Show the seats"),
            new TicketStrategy(2, "Buy a ticket"),
            new StatisticStrategy(3,"Statistics"),
            new BackStrategy(0, "Exit")
    );

    public void printMenu (){
        for (MenuStrategy option : options) {
            System.out.println(option);

        }
    }

    public boolean executeProvider (int numberFromMenu, Board board){
        Optional<MenuStrategy> optional = options.stream().filter(x-> x.order == numberFromMenu).findFirst();

        if (optional.isPresent()) {
            System.out.println();
            return optional.get().executeStrategy(board);

        }else{
            return false;
        }


    }
}
