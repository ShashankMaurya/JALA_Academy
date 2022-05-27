package lab5_Static;

public class Q1 {
    static int a=10, b=20;
    int c=90, d=100;
    static void fun1()
    {
        Q1 obj=new Q1();
        System.out.println("Instance var. from static method: "+obj.c+" , "+obj.d);
    }
    static void fun2()
    {
        Q1 ob=new Q1();
        ob.fun3();
    }
    void fun3()
    {
        System.out.println("Static var. from instance method: "+a+" , "+b);
    }
    void fun4()
    {
        fun1();
    }
    public static void main(String[] args) {
        Q1 o=new Q1();
        System.out.println("Static var. from main method: "+a+" , "+b);
        System.out.println("Instance var. from main method: "+o.c+" , "+o.d);
        fun1();
        fun2();
        o.fun3();
        o.fun4();
    }
}
