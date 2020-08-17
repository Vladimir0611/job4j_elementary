package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTestTest {

    @Test
    public void distance() {
        int x1 = 4;
        int y1 = 1;
        int x2 = 1;
        int y2 = 2;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}