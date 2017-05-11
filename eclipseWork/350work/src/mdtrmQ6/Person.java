package mdtrmQ6;

class Person implements Unit {
	private String _name;
	private String _title;
	private double _basePay;

	Person(String name, String title, double basePay) {
		_name = name;
		_title = title;
		_basePay = basePay;
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