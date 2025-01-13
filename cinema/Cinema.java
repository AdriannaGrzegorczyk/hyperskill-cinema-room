package cinema;




public class Cinema {

    public static void main(String[] args) {


  TextUI textUI = new TextUI();
  TicketService ticketService = new TicketService();
  Board board = ticketService.createBoard();
        ticketService.initCounting(board);

    }
}