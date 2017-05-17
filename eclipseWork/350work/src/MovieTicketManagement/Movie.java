package MovieTicketManagement;

public class Movie implements IMovie, IMovieSubscription {
	int tickets = 10;
	float price = 10;
	Context context;
	String currentState;
	String type;

	public Movie(String type) {
		this.context = new Context();
		NotOnSaleState noss = new NotOnSaleState();
		noss.doAction(context);
		this.currentState = context.getState().toString();
		if (type.equals("Standard") ||type.equals("IMAX") || type.equals("3D") || type.equals("IMAX 3D")){
			this.type=type;
		}
		else{
			throw new IllegalArgumentException("Invalid Movie Type");
		}
	}

	public String buyTickets(int quantity) {
		if (quantity > tickets) {
			return "Not enough tickets left";
		} else if (currentState.equals("Not On Sale")) {
			return "Not yet on sale";
		} else if (currentState.equals("On Sale")) {
			tickets -= quantity;
			if (tickets == 0) {
				SoldOutState sos = new SoldOutState();
				sos.doAction(context);
				currentState = context.getState().toString();
				return "Here are your tickets";
			} else {
				return "Here are your tickets";
			}
		}

		else if (currentState.equals("Sold Out")) {
			return "Sold out";
		}
		else{
			return "shits fucked";
		}
	}
	public boolean isOnSale(){
		if (currentState.equals("On Sale")){
			return true;
		}
		else{
			return false;
		}
	}
	public float getPrice(){
		if (type.equals("IMAX")){
			return price+2;
		}
		else if (type.equals("3D")){
			return price+3;
		}
		else if (type.equals("IMAX 3D")){
			return price+5;
		}
		else{
			return price;
		}
			
	}
	public void goOnSale(){
		OnSaleState oss = new OnSaleState();
		oss.doAction(context);
		currentState = context.getState().toString();
	}
	public void notifyWhenOnSale(IMovieSubscriber subscriber){
		if(currentState.equals("On Sale")){
			subscriber.update();
		}
	}

}
