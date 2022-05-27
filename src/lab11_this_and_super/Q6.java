package lab11_this_and_super;

class parent2 {
    int a;

    void fun(int a) {
        this.a = a;
        System.out.println("Parent function evoked. \nvalue = " + a);
    }
}

public class Q6 extends parent2 {
    String s;

    void fun(String s, int a) {
        super.fun(a);
        this.s = s;
        System.out.println("Child function Evoked. \nvalue = " + s);
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        obj.fun("Sharon", 69);
    }
}
