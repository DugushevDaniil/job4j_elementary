package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent /= 100;
        while (amount > 0) {
            amount = amount + percent * amount;
            amount -= salary;
            year += 1;
        }
        return year;
    }
}
