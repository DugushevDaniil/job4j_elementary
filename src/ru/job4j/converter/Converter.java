package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static double rubleToDollar(double value) {
        /* формула перевода рублей в доллары. */
        return  value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        double dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
    }
}
