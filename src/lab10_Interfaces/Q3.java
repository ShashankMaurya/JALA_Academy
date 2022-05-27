package lab10_Interfaces;

interface inter03
{
    default void fund()
    {
        System.out.println("Default function.");
    }
    void fun();
}

public class Q3 implements inter03{
    @Override
    public void fun() {
        System.out.println("Good function.");
    }

    public static void main(String[] args) {
        inter03 obj=new Q3();
        obj.fun();
        obj.fund();
    }
}
