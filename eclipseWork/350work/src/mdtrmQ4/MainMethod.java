package mdtrmQ4;


public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group apple = new Group("Apple");
		Group mac = new Group("Macintosh");
		Person tim = new Person("Tim","BigBoss",1);
		apple.add(tim);
		Person alice = new Person("Alice", "Manager", 2000);
		Person bob = new Person("Bob", "Worker", 35);
		mac.add(alice);
		mac.add(bob);
		apple.add(mac);
		double test = apple.getYComp();
		System.out.println(test);
	}

}
