package lab14_Exceptions;

public class Q9 {
    public static void main(String[] args) {
        try {
            int[] a ={1,2,3,4,5};
            a[9]=100;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught");
//            e.printStackTrace();
        }
    }
}
