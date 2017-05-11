package mdtrmQ4;

public class Manager implements Unit {
	private String _name; // Name
	private double _basePay; // Hourly or weekly pay

	public Manager(String name, double pay){
		_name = name;
		_basePay = pay;
	}
	public double getYComp() {
		return _basePay * 52;
	}
	
	public String toString(){
		return _name;
	}
}
