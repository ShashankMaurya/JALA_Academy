package lab10_Interfaces;

interface inter09
{
    void fun01();
}
interface inter9 extends inter09
{
    void fun02();
}

public class Q7 implements inter9{
    @Override
    public void fun01() {
        System.out.println("Parent interface function.");
    }

    @Override
    public void fun02() {
        System.out.println("Child Interface function.");
    }

    public static void main(String[] args) {
        Q7 obj=new Q7();
        obj.fun01();
        obj.fun02();
    }
}
