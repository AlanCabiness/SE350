package MovieTicketManagement;

public interface IMovieSubscription {
	void goOnSale();
	void notifyWhenOnSale(IMovieSubscriber subscriber);
}
