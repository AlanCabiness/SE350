package mdtrmGuzy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args) throws NumberFormatException, IOException, Error {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while(!(input = br.readLine()).toLowerCase().equals("exit")){
			Unit strategy;
			String title = input;
			System.out.println("Give this employee a basepay: ");
			input = br.readLine();
			double basepay = Double.parseDouble(input);
			
			if (title.equals("BigBoss"))
				strategy = new BigBossStrategy(basepay);
			else if(title.equals("Manager"))
				strategy = new ManagerStrategy(basepay);
			else if(title.equals("Worker"))
				strategy = new WorkerStrategy(basepay);
			else
				throw new Error("This should not happen");
			
			Person personGenerator = new Person(strategy);
			personGenerator.toString(title);
			System.out.println(personGenerator.getYComp());
	}

}
}
