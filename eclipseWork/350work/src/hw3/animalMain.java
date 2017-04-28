package hw3;
import java.util.Scanner;

import Zoo.animals;

public class animalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true){
			Scanner scanner = new Scanner(System.in);
			String animal = scanner.nextLine();
			if (animal=="dog"){
				animals.dogTalk();
			}
			else if (animal == "cat"){
				animals.catTalk();
			}
			else if (animal == "bear"){
				animals.bearTalk();
			}
			else if (animal == "horse"){
				animals.horseTalk();
			}
			else if (animal == "cow"){
				animals.cowTalk();
			}
			else{
				break;
			}
			scanner.close();
		}
	}

}
