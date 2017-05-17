package MovieTicketManagement;

public class NotOnSaleState implements State {
	public void doAction(Context context){
		context.setState(this);
	}
	public String toString(){
		return "Not on Sale";
	}
}