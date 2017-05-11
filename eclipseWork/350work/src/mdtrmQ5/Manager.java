package mdtrmQ5;

public class Manager implements FactPerson {
	public String getTitle() {
		return "BigBoss";
	}

	public double getTitleAmount() {
		return basePay * 52;
	}
}
