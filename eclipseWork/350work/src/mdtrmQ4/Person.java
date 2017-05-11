package mdtrmQ4;

/** A person. */
public class Person implements Unit {
	private String _name; // Name
	private String _title; // Title is "BigBoss" or "Manager" or "Worker"
	private double _basePay; // Hourly or weekly pay
	private double _comp;
	
	public Person(String name, String title, double basePay) {
		_name = name;
		_title = title;
		_basePay = basePay;
		if (_title.equals("BigBoss")){
			BigBoss bb = new BigBoss(name, basePay);
			_comp = bb.getYComp();
			_name = bb.toString();
		}
		else if (_title.equals("Manager")){
			Manager m = new Manager(name, basePay);
			_comp = m.getYComp();
			_name = m.toString();
		}
		else if (_title.equals("Worker")){
			Worker w = new Worker(name, basePay);
			_comp = w.getYComp();
			_name = w.toString();
		}
		
	}

	public double getYComp() {
		return _comp;
	}

	public String toString() {
		return _name;
	}
}
