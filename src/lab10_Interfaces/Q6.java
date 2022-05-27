package lab10_Interfaces;

interface inter08
{
    default void fund()
    {
        System.out.println("Default function.");
    }
    void fun();
}

public class Q6 implements inter08 {

    @Override
    public void fun() {
        System.out.println("abstract method.");
    }

    public static void main(String[] args) {
        Q6 obj=new Q6();
        obj.fun();
        obj.fund();
    }
}
