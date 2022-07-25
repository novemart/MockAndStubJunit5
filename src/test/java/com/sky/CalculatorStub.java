package com.sky;

public class CalculatorStub  implements ICalculator{

    @Override
    public double add(double num1, double num2) {
        return 100;
    }

    @Override
    public double divide(double num1, double num2) throws DivisionByZeroException {
        return 0;
    }
}
