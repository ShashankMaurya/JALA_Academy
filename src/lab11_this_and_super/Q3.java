package lab11_this_and_super;

public class Q3 {
    int a;
    String s;

    Q3()
    {
        System.out.println("Default Constructor Evoked");
        this.a=0;
        this.s="";
    }
    Q3(int a, String s)
    {
        this();  // TODO: evoking parameterized constructor using 'this'
        System.out.println("Name: "+this.s+"\nAge: "+this.a);
        System.out.println("Parameterized Constructor Evoked");
        this.a=a;
        this.s=s;
        System.out.println("Name: "+this.s+"\nAge: "+this.a);
    }

    public static void main(String[] args) {
        Q3 obj=new Q3();
        Q3 ob=new Q3(11,"Sharon");
    }
}
