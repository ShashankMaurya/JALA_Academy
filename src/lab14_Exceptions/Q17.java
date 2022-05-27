package lab14_Exceptions;

public class Q17 {
    public static void main(String[] args) {
        try {
            String s="Hello";
            char c=s.charAt(5);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }
}
