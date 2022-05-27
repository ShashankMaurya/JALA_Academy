package lab12_Constructors;

public class Q1 {

    int a,b;
    String s;

    Q1()
    {
        System.out.println("default constructor evoked.");
        a=0;
        b=0;
        s="";
    }
    Q1(int a, String s)
    {
        System.out.println("2 parameter constructor evoked.");
        this.s=s;
        this.a=a;
        System.out.println("Name: "+this.s+"\nHeight: "+this.a);
    }
    Q1(int a, int b, String s)
    {
        System.out.println("3 parameter constructor evoked.");
        this.s=s;
        this.a=a;
        this.b=b;
        System.out.println("Name: "+this.s+"\nHeight: "+this.a+"\nWeight: "+this.b);
    }

    public static void main(String[] args) {
        Q1 obj=new Q1();
        Q1 ob=new Q1(20, "Shane");
        Q1 o=new Q1(30,100,"Warner");
    }
}
