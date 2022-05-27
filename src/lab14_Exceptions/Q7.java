package lab14_Exceptions;

public class Q7 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Generating Arithmetic Exception: " + (7 / 0));
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Runtime Exception");
        }
        catch (ArithmeticException n)
        {
            System.out.println("Arithmatic Exception");
        }
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("Code completed");
    }
}
