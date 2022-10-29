package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to00then2() {
        int expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to00then3() {
        int expected = 3;
        Point a = new Point(0, 3);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to03then6() {
        int expected = 6;
        Point a = new Point(0, 3);
        Point b = new Point(0, -3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to57then721() {
        double expected = 7.21;
        Point a = new Point(1, 1);
        Point b = new Point(5, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
