package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int a = x2 - x1;
        int b = y2 - y1;
        double one = Math.pow(a, 2);
        double two = Math.pow(b, 2);
        double three = one + two;
        return Math.sqrt(three);
    }

    public static void main(String[] args) {
double result = Point.distance(2,  3, 5, 7);
        System.out.println("result (2,3) to (5,7) is " + result);
    }
}
