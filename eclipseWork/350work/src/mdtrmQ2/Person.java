package mdtrmQ2;

/** A person. */
public class Person implements Unit {
	private String _name; // Name
	private String _title; // Title is "BigBoss" or "Manager" or "Worker"
	private double _basePay; // Hourly or weekly pay

	public Person(String name, String title, double basePay) {
		if (title == "BigBoss" || title == "Manager" || title == "Worker") {
			_name = name;
			_title = title;
			_basePay = basePay;
		} else {
			throw new IllegalArgumentException("Unacceptable title");
		}
	}

	public double getYComp() {
		if (_title.equals("BigBoss")) {
			return _basePay * 52 + 5000000;
		} else if (_title.equals("Manager")) {
			return _basePay * 52;
		} else if (_title.equals("Worker")) {
			return _basePay * 52 * 40;
		} else {
			throw new Error("This should not happen.");
		}
	}

	public String toString() {
		if (_title.equals("BigBoss")) {
			return _name.toUpperCase();
		} else if (_title.equals("Manager")) {
			return _name;
		} else if (_title.equals("Worker")) {
			return _name.toLowerCase();
		} else {
			throw new Error("This should not happen.");
		}
	}
}
