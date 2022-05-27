package lab14_Exceptions;

public class Q15 {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException caught");
        }
    }
}
