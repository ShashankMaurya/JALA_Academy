package lab14_Exceptions;

public class Q4 {
    public static void main(String[] args) {
        try {
            System.out.println("Generating Arithmetic Exception: " + (7 / 0));
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Runtime Exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic Exception");
        }
        System.out.println("Code completed");
    }
}
