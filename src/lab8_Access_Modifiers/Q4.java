package lab8_Access_Modifiers;

public class Q4 {
    public int n=20;
    public String s="Hello";
    public void fun()
    {
        System.out.println("This is Public access method with data members "+n+" and "+s);
    }
}

class temp3
{
    public static void main(String[] args) {
        Q4 obj=new Q4();
        System.out.println("Public access variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
