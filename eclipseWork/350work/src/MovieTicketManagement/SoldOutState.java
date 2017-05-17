package MovieTicketManagement;

public class SoldOutState implements State {
	public void doAction(Context context){
		context.setState(this);
	}
	public String toString(){
		return "Sold Out";
	}
}
