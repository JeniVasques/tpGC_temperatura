package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testeFahrenheitParaCelsius() {
        assertEquals(100,
                App.fahrenheitParaCelsius(212),
                0.1);
    }

    @Test
    public void testeCelsiusParaFahrenheit() {
        assertEquals(212,
                App.celsiusParaFahrenheit(100),
                0.1);
    }
}