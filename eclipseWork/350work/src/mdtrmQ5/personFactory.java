package mdtrmQ5;

public class personFactory {
	public static FactPerson createPerson(String personType) {
		FactPerson person;
		if (personType.equals("BigBoss")) {
			person = new BigBoss();
			// return _basePay*52 + 5000000;
		} else if (personType.equals("Worker")) {
			person = new Worker();
			// return _basePay*52;
		} else if (personType.equals("Manager")) {
			person = new Manager();
			// return _basePay*52*40;
		}

		return null;
	}

}
