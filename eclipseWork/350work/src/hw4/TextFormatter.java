package hw4;

import java.util.Scanner;

public class TextFormatter {
	
	public interface ITextFormatter{
		void printString(String input);
	}
	public class StratClass1 implements ITextFormatter{
		public void printString(String input){
			if(input.startsWith("+"))
				System.out.println(input.replaceAll("\\+", "").toUpperCase());
			else if (input.startsWith("-"))
				System.out.println(input.replaceAll("\\-", "").toLowerCase());
			else
				System.out.println(input);
		}
	}
	String input;
	public void doFormat(ITextFormatter itf){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter string with + or - at the start: ");
		String input = scanner.nextLine();
		ITextFormatter formatter = new StratClass1();
		formatter.printString(input);
	}
	
}
