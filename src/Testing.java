public class Testing {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static double func2(double x) {
        double y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = Testing.func1(3);
        double result2 = Testing.func2(5);
        double total = result1 + result2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(total);
    }
}
