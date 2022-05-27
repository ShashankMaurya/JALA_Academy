package lab7_Inheritance;

class A
{
    int n=11;

    void methodA1() {
        System.out.println("This is Class A Method 1");
    }

    void methodA2() {
        System.out.println("This is Class A Method 2");
    }

    void method3() {
        System.out.println("This is override method - Class A");
    }
}
class B extends A
{
    int n=22;

    void methodB1() {
        System.out.println("This is Class B Method 1");
    }

    void methodB2() {
        System.out.println("This is Class B Method 2");
    }

    @Override
    void method3() {
        System.out.println("This is override method - Class B");
    }
}
class C extends B
{
    int n=33;

    void methodC1() {
        System.out.println("This is Class C Method 1");
    }

    void methodC2() {
        System.out.println("This is Class C Method 2");
    }

    @Override
    void method3() {
        System.out.println("This is override method - Class C");
    }
}

public class Q1
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.methodA1();
        a.methodA2();
        a.method3();

        b.methodB1();
        b.methodB2();
        b.method3();

        c.methodC1();
        c.methodC2();
        c.method3();

        A obj;

        obj = new B();
        obj.method3();

        obj = new C();
        obj.method3();

        A ob;
        ob = new A();
        System.out.println(ob.n);
        ob = new B();
        System.out.println(ob.n);
        ob = new C();
        System.out.println(ob.n);
    }
}
