package ru.job4j.calculator;

import static  ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndDif(double first, double second) {
        return dividing(first, second)
                + difference(first, second);
    }

    public static double allofCalc(double first, double second) {
        return dividing(first, second)
                + difference(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы вычитания и деления равен: " + divAndDif(10, 20));
        System.out.println("Результат расчета суммы всех действий равен: " + allofCalc(10, 20));
    }
}
