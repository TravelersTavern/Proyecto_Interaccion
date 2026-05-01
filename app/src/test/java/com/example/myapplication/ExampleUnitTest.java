package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {

    @Test
    public void etaCalculation_returnsRoundedMinutes() {
        int result = EtaCalculator.estimateMinutes(12.0, 30.0, 1.25);
        assertEquals(30, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void etaCalculation_throwsForInvalidSpeed() {
        EtaCalculator.estimateMinutes(5.0, 0.0, 1.20);
    }
}