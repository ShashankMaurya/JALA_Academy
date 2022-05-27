package lab14_Exceptions;

public class Q10 {
    public static void main(String[] args) {
        try {
            Class.forName("Q69");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException caught");
        }
    }
}
