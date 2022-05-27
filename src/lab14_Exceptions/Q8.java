package lab14_Exceptions;

public class Q8 {
    public static void main(String[] args) {
        try {
            int x=7/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmatic Exception caught");
//            e.printStackTrace();
        }
    }
}
