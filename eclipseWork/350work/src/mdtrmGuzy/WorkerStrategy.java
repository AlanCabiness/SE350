package mdtrmGuzy;

public class WorkerStrategy implements Unit{
	double _basepay;
	public WorkerStrategy(double basepay){
		_basepay = basepay;
	}
	public double getYComp() {
		_basepay = (_basepay * 52) * 40;
		return _basepay;
	}

	public String toString(String input) {
		input = input.toLowerCase();
		return input;
	}

}
