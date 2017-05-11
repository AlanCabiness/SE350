package mdtrmQ5;

class Person implements Unit {
	private String _name; // Name
	private String _title; // Title is "BigBoss" or "Manager" or "Worker"
	private double _basePay; // Hourly or weekly pay

	Person(String name, String title, double basePay) {
		_name = name;
		_title = title;
		_basePay = basePay;
	}

	public double getYComp() {
		String personType = _title;
		Double basePay = _basePay;
		FactPerson person = personFactory.createPerson(personType);
		return person.getTitleAmount();
	}

	public String toString() {
		String personType = _title;
		FactPerson person = personFactory.createPerson(personType);
		return person.getTitle();
	}
}
