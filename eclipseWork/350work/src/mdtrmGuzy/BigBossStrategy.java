package mdtrmGuzy;

public class BigBossStrategy implements Unit{
	double _basepay;
	public BigBossStrategy(double basepay){
		_basepay = basepay;
	}

	public double getYComp() {
		_basepay = (_basepay * 52) + 5000000;
		return _basepay;
	}
	
	public String toString(String input){
		input.toUpperCase();
		return input;
	}

}