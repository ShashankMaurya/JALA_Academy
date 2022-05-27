package lab14_Exceptions;

import java.lang.reflect.Method;

public class Q14 {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("lab1_Java_basics.Q5");
            Method m=c.getDeclaredMethod("newfun");
        }
        catch (NoSuchMethodException | ClassNotFoundException e)
        {
            System.out.println("NoSuchMethodException caught");
        }
    }
}
