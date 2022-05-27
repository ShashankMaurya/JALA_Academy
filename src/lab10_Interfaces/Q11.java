package lab10_Interfaces;

interface inter13
{
    public String s1 = "PUBLIC variable";
    static final String s2 = "STATIC FINAL variable";
}

public class Q11 implements inter13{
    public static void main(String[] args) {
        Q11 obj=new Q11();
        System.out.println(obj.s1);
        System.out.println(obj.s2);
    }
}
