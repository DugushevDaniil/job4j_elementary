package ru.job4j.array;

public class AlgoArray2 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};

        for (int index = 0; index < array.length; index++) {
            int min = array[index];
            int minInd = index;

            for (int j = index + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minInd = j;
                }
            }

            if (index != minInd) {
                int temp = array[index];
                array[index] = array[minInd];
                array[minInd] = temp;
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}