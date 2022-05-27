package lab10_Interfaces;

interface inter12
{
    public String s1 = "PUBLIC variable";
//    private String s2 = "PRIVATE";
//    protected String s3 = "PROTECTED";
}
public class Q10 implements inter12{
    public static void main(String[] args) {
        Q10 obj=new Q10();
        System.out.println(obj.s1);
//        System.out.println(obj.s2);
//        System.out.println(obj.s3);
//        TODO: private and protected variables not allowed in interface
    }
}
