package lab10_Interfaces;

interface inter04
{
    void fun01();
}
interface inter05
{
    void fun02();
}

public class Q4 implements inter04, inter05{
    @Override
    public void fun01() {
        System.out.println("Interface 1 Function 1");
    }

    @Override
    public void fun02() {
        System.out.println("Interface 2 Function 1");
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        obj.fun01();
        obj.fun02();
    }
}
