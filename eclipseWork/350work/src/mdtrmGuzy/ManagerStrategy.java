package mdtrmGuzy;

public class ManagerStrategy implements Unit{
	double _basepay;
	public ManagerStrategy(double basepay){
		_basepay = basepay;
	}

	public double getYComp() {
		_basepay = _basepay * 52;
		return _basepay;
	}
	
	public String toString(String input){
		return input;
	}

}
