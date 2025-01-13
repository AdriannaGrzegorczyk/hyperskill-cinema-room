package cinema;




public class Cinema {

    public static void main(String[] args) {

  TextUI textUI = new TextUI();
  TicketService ticketService = new TicketService();
 // textUI.start();
        ticketService.initCounting();

    }
}