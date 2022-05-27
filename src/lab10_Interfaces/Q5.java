package lab10_Interfaces;

interface inter06
{
    void fun01();
}
interface inter07
{
    void fun01();
}

public class Q5 implements inter06, inter07{
    @Override
    public void fun01() {
        System.out.println("Two interface, one method");
    }

    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.fun01();
    }
}
