package mdtrmQ5;

public class BigBoss implements FactPerson {
	public String getTitle() {
		return "BigBoss";
	}

	public double getTitleAmount() {
		return basePay * 52 + 5000000;
	}
}