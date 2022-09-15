package ru.job4j;

public class Arguments {
    public static void hello(String name) {
    System.out.println("Hello, " + name);
}

    public static void main(String[] args) {
        String name = "Daniil";
        int age = 33;
        Arguments.hello(name);
    }
}
