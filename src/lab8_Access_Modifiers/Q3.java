package lab8_Access_Modifiers;

public class Q3 {
    protected int n=20;
    protected String s="Hello";
    protected void fun()
    {
        System.out.println("This is Protected access method with data members "+n+" and "+s);
    }
}

class temp2
{
    public static void main(String[] args) {
        Q3 obj=new Q3();
        System.out.println("Protected access variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
