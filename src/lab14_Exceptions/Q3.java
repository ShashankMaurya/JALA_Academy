package lab14_Exceptions;

public class Q3 {
    static void fun()
    {
        throw new RuntimeException("Exception Thrown");
    }

    public static void main(String[] args) {
        fun();
    }
}
