package lab13_Method_Overloading;

public class Q2 {
    static int calc(int n) {
        return (int) Math.pow(n, 2);
    }

    static int calc(int a, double b) {
        return (int) (a * b);
    }

    public static void main(String[] args) {
        System.out.println("Square of 6 is " + calc(6));
        System.out.println("Product of 6 and 6.9 is " + calc(6, 6.9));
    }
}
