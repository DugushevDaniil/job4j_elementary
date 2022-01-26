package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {13, 5, 32, 27, 2, 23};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 13, 23, 27, 32};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {1, 2, 3, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {10, 8, 6, 4, 2, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 4, 6, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
