package mdtrmQ4;

public class Worker implements Unit {
	private String _name; // Name
	private double _basePay; // Hourly or weekly pay

	public Worker(String name, double pay){
		_name = name;
		_basePay = pay;
	}
	public double getYComp() {
		return _basePay * 52 * 40;
	}
	
	public String toString(){
		return _name.toLowerCase();
	}
}
