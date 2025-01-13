package cinema;

import java.util.Arrays;

public class TextUI {

    private final int ROWS=7;
    private final int COL=8;

    private final char[][] SEATS = new char[ROWS][COL];


    public TextUI () {
        initSeats();
    }

    private void initSeats() {

        for (char [] row : SEATS){
            Arrays.fill(row,'S');
        }
    }

    public void start(){
        printRoom();
    }

    private void printRoom() {

        System.out.println("Cinema:");

        for (int i =1;i<=COL;++i){
            System.out.print(" "+i);
        }
        System.out.println();

        for(int i = 0; i<ROWS;++i){
            System.out.print(i+1);
            for (int j =0;j<COL;++j){
                System.out.print(" " + SEATS[i][j]);
            }
            System.out.println();
        }

    }

}
