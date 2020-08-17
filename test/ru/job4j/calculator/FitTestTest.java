package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.assertEquals;

public class FitTestTest {

    @Test
    public void manWeight() {
        short height = 187;
        double expected = 100.05;
        double out = ru.job4j.Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short height = 187;
        double expected = 88.55;
        double out = ru.job4j.Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}