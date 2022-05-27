package lab11_this_and_super;

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
public class Q5 extends parent1{

    int a;
    String s;

    Q5()
    {
        super();
        System.out.println("Default Constructor of child class Evoked");
        this.a=0;
        this.s="";
    }
    Q5(int a, String s)
    {
        super(a,s);
        System.out.println("Parameterized Constructor of child class Evoked");
        this.a=a;
        this.s=s;
        System.out.println("Name: "+this.s+"\nAge: "+this.a);
    }

    public static void main(String[] args) {
        Q5 obj=new Q5();
        Q5 ob=new Q5(11,"Sharon");
    }
}