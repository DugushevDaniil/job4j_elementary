package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbers3to8then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumEvenNumbers1to1then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumEvenNumbers1to53then702() {
        int start = 1;
        int finish = 53;
        int result = Counter.sumByEven(start, finish);
        int expected = 702;
    }
}
