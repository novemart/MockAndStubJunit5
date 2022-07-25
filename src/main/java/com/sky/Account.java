package com.sky;

public class Account {
	
	private ICalculator calculator;
	private double balance; 
	
	//needs a 'ICalculator' object to calculate balance
	public Account(double initBalance, ICalculator calculator){
		if ( initBalance < 0 ) {
			//runtime exception
			throw new IllegalArgumentException(
					"Initial balance cannot be negative");
		}
		this.calculator = calculator;
		this.balance = calculator.add(initBalance, 500.0);
	}
	
	public double getBalance() { 
		return this.balance; 
	}

	public double getInterest(double futureValue, double interest) throws DivisionByZeroException{
		return calculator.divide(futureValue, interest );
	}
}
