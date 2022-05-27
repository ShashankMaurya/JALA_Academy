package lab12_Constructors;

class parent1 {

    int a;
    String s;

    parent1()
    {
        System.out.println("Default Constructor of parent class Evoked");
        this.a=0;
        this.s="";
    }
    parent1(int a, String s)
    {
        System.out.println("Parameterized Constructor of parent class Evoked");
        this.a=a;
        this.s=s;
        System.out.println("Name: "+this.s+"\nAge: "+this.a);
    }
}

public class Q2 extends parent1 {

    int a;
    String s;

    Q2() {
        super();
        System.out.println("Default Constructor of child class Evoked");
        this.a = 0;
        this.s = "";
    }

    Q2(int a, String s) {
        super(a, s);
        System.out.println("Parameterized Constructor of child class Evoked");
        this.a = a;
        this.s = s;
        System.out.println("Name: " + this.s + "\nAge: " + this.a);
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        Q2 ob = new Q2(11, "Sharon");
    }
}
