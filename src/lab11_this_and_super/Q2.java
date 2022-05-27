package lab11_this_and_super;

class parent {
    int a = 5;
    int b = 69;

    void fun() {
        System.out.println("This is parent function.");
        System.out.println("Data members: " + this.a + " , " + this.b);
    }
}

public class Q2 extends parent
{
    int a=1;
    int b=2;
    void fun()
    {
        System.out.println("This is child function.");
        System.out.println("Data members of parent class: " + super.a + " , " + super.b);
        System.out.println("Data members of child/this class: " + this.a + " , " + this.b);
        super.fun(); // TODO: parent class fun() called
    }
    public static void main (String[]args) {
        Q2 obj=new Q2();
        obj.fun(); // TODO: child class fun() called
    }
}