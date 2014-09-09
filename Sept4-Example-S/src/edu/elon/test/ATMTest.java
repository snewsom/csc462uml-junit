package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	
	ATM atm;

	@Before
	public void setUp() throws Exception {
		atm = new ATM(10);
	}

	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	@Test
	public void testDeposit() {
		atm.deposit(5);
		double actual = atm.getBalance();
		double expected = 15;
		assertEquals(actual, expected, 0.2f);
	}

	@Test
	public void testGetBalance() {
		double actual = atm.getBalance();
		double expected = 10;
		assertEquals(actual, expected, 0.2f);
	}

	@Test
	public void testToString() {
		String actual = atm.toString();
		String expected = "Amount balance is $10.00";
		assertEquals(actual,expected);
		
	}

	@Test
	public void testWithdraw() {
		atm.withdraw(3);
		double actual = atm.getBalance();
		double expected = 7;
		assertEquals(actual,expected,0.2f);
	}

}
