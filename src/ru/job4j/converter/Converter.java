package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static int rubleToDollar(int value) {
        /* формула перевода рублей в доллары. */
        return  value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
       int dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        out = Converter.rubleToDollar(in);
        expected = 2;
        passed = expected == out;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed);
    }
}
