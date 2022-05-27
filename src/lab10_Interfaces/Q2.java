package lab10_Interfaces;

interface inter02
{
    void fun1();
    void implemented();
}

public class Q2 implements inter02 {

    @Override
    public void fun1() {
        System.out.println("This method is implemented because all methods are to be used in a class which implements their interface.");
    }

    @Override
    public void implemented() {
        System.out.println("This method was supposed to be implemented.");
    }
    public static void main(String[] args) {
        Q2 obj=new Q2();
        obj.implemented();
        obj.fun1();
    }
}
