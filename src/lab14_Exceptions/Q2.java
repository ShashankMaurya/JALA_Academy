package lab14_Exceptions;

public class Q2 {
    public static void main(String[] args) {
        try {
            System.out.println("Generating Arithmetic Exception: " + (7 / 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("Code completed");
    }
}
