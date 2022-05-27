package lab11_this_and_super;

public class Q1 {
    int a=5;
    int b=69;
    void fun1()
    {
        System.out.println("This is function.");
        System.out.println("Data members: "+this.a+" , "+this.b);
    }

    public static void main(String[] args) {
        Q1 obj=new Q1();
        obj.fun1();
    }
}
