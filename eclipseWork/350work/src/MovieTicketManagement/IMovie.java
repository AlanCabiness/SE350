package MovieTicketManagement;

public interface IMovie {
	String buyTickets(int quantity);
	boolean isOnSale();
	float getPrice();
}
