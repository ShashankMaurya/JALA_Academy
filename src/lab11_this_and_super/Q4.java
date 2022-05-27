package lab11_this_and_super;

public class Q4 {
    int a;
    String s;

    Q4()
    {
        this(23, "Samuel"); // TODO: evoking parameterized constructor using 'this'
        System.out.println("Default Constructor Evoked");
    }
    Q4(int a, String s)
    {
        System.out.println("Parameterized Constructor Evoked");
        this.a=a;
        this.s=s;
        System.out.println("Name: "+this.s+"\nAge: "+this.a);
    }

    public static void main(String[] args) {
        Q4 obj=new Q4();
        Q4 ob=new Q4(11,"Sharon");
    }
}
