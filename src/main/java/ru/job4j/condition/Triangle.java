package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
      return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        if (exist(5, 3, 5)) {
            System.out.println("Существует");
        } else {
            System.out.println("Не существует");
        }
    }
}
