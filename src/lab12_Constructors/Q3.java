package lab12_Constructors;

public class Q3 {
    String name;
    char g;
    int a,roll;
    Q3()
    {
        this(21);
    }
    public Q3(int a)
    {
        this("Sharon", 1928259);
        this.a=a;
        System.out.println("Age: "+this.a);
    }
    private Q3(String name, int roll)
    {
        this('F');
        this.name=name;
        this.roll=roll;
        System.out.println("Name: "+this.name+"\nRoll: "+this.roll);
    }
    protected Q3(char g)
    {
        this.g=g;
        System.out.println("Gender: "+this.g);
    }

    public static void main(String[] args) {
        Q3 obj=new Q3();    }
}
