package lab8_Access_Modifiers;

class Q1 {
    private int n=20;
    private String s="Hello";
    private void fun()
    {
        System.out.println("This is private method with data members "+n+" and "+s);
    }

    public static void main(String[] args) {
        Q1 obj=new Q1();
        System.out.println("Private variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
class sub extends Q1
{
    public static void main(String[] args) {
//        System.out.println(fun());
//        TODO: Private members cannot be accessed by subclasses
    }
}