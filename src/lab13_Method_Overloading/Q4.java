package lab13_Method_Overloading;

public class Q4 {
    static int calc(int n) {
        return (int) Math.pow(n, 2);
    }

    static int calc(double n) {
        return (int) Math.pow(n,3);
    }

    public static void main(String[] args) {
        System.out.println("Square of 6 is " + calc(6));
        System.out.println("Cube of 6 is " + calc(6.0));
    }
}
