package lab14_Exceptions;

public class Q16 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("1234ABCD");
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException caught");
        }
    }
}
