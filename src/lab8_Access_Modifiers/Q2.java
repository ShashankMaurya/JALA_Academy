package lab8_Access_Modifiers;

class Q2 {
    int n=20;
    String s="Hello";
    void fun()
    {
        System.out.println("This is Default access method with data members "+n+" and "+s);
    }
}
class temp
{
    public static void main(String[] args) {
        Q2 obj=new Q2();
        System.out.println("Default access variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
