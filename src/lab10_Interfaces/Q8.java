package lab10_Interfaces;


public class Q8 implements inter10{
    @Override
    public void fun() {
        System.out.println("interface function.");
    }

    public static void main(String[] args) {
        Q8 obj=new Q8();
        System.out.println(obj.n);
        obj.fun();
    }
}
