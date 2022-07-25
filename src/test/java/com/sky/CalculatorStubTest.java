package com.sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorStubTest {

    @Test
    public void checkBalanceHigherThanZeroTest(){
        Account acc = new Account(100, new CalculatorStub());
        Assertions.assertEquals(100, acc.getBalance());
    }
}
