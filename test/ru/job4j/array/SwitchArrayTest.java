package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {
        @Test
        public void whenSwap0to3() {
            int[] input = {1, 2, 3, 4};
            int source = 0;
            int dest = input.length - 1;
            int[] result = SwitchArray.swap(input, source, dest);
            int[] expected = {4, 2, 3, 1};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
    public void whenSwap0to2() {
            int[] input = {1, 2, 3, 4};
            int source = 0;
            int dest = input.length - 2;
            int[] result = SwitchArray.swap(input, source, dest);
            int[] expected = {3, 2, 1, 4};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
    public void whenSwap1to5() {
            int[] input = {1, 2, 3, 6, 12, 24};
            int source = 1;
            int dest = input.length - 1;
            int[] result = SwitchArray.swap(input, source, dest);
            int[] expected = {1, 24, 3, 6, 12, 2};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
    public void whenSwap3to4() {
            int[] input = {1, 2, 3, 6, 12, 24};
            int source = 3;
            int dest = input.length - 2;
            int[] result = SwitchArray.swap(input, source, dest);
            int[] expected = {1, 2, 3, 12, 6, 24};
            Assert.assertArrayEquals(expected, result);
        }
    }

