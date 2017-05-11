package mdtrmQ5;

public class Worker implements FactPerson {
	public String getTitle() {
		return "Worker";
	}

	public double getTitleAmount() {
		return basePay * 52 * 40;
	}
}