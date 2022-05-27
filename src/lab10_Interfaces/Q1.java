package lab10_Interfaces;

interface inter01
{
    void fun();
}

public class Q1 implements inter01 {
    @Override
    public void fun() {
        System.out.println("One interface method");
    }
    public static void main(String[] args) {
        Q1 obj=new Q1();
        obj.fun();
    }
}
