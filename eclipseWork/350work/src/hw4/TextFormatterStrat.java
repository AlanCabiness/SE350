/*package hw4;

public class TextFormatterStrat {
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
}
*/