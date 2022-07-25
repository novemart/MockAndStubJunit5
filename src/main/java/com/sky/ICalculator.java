package com.sky;

public interface ICalculator {
	
	public double add(double num1, double num2);
	
	public double divide(double num1, double num2) throws DivisionByZeroException;

}
