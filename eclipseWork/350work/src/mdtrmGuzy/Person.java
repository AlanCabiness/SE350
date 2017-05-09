package mdtrmGuzy;

public class Person{
	private String _name; // Name 
	private Unit personGenerator;
	
	public Person(Unit strategy) {
		personGenerator = strategy;
	}
	public double getYComp () {
		double basepay = personGenerator.getYComp();
		return basepay;
	}
	
	public void toString(String title){
		title = personGenerator.toString(title);
		System.out.println(title);
	}

}
