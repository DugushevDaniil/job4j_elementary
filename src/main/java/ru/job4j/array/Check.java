package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            boolean datum = data[i];
            if (data[0] != datum) {
                result = false;
                break;
            }
        }
        return result;
    }
}
