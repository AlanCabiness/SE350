package hw1;

public class BankAccount { 
	public double balance; 
	public double withdraw(double amount) throws Exception{
		if(balance - amount < 0) 
			throw new Exception("Not enough balance"); 
		balance -= amount; 
		return balance; 
	} 
	public double deposit(double amount){ 
		balance += amount; 
		return balance; 
	} 
}
