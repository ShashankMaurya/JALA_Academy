package lab14_Exceptions;

import java.lang.reflect.Field;

public class Q13 {
    public static void main(String[] args) {
        Q13 obj=new Q13();
        Class c=obj.getClass();
        try {
            Field f=c.getField("Random_name");
        }
        catch (NoSuchFieldException e)
        {
            System.out.println("NoSuchFieldException caught");
        }
    }
}
