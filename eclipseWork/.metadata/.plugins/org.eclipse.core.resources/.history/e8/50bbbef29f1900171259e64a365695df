package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void withdrawtestnoEx() throws Exception {
		BankAccount a = new BankAccount();
		a.balance=250;
		double acompare = a.balance-50.0;
		a.withdraw(50.0);
		assertTrue(a.balance==acompare);
	}
	
	@Test
	public void withdrawtestEx() throws Exception {
		BankAccount a = new BankAccount();
		a.balance=250;
		try{
			a.withdraw(300.0);
			fail("Exception not thrown");
		}
		catch(Exception ex){
			assertEquals(ex.getMessage(),"Not enough balance");
		}
	}
	
	@Test
	public void depositTest(){
		
		BankAccount b = new BankAccount();
		b.balance=250;
		double bcompare = b.balance+50.0;
		b.deposit(50.0);
		assertTrue(b.balance==bcompare);
	}
}