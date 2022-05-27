package lab8_Access_Modifiers.pack2;

import lab8_Access_Modifiers.Q3;

public class Q3_1
{
    public static void main(String[] args) {
//        Q3 obj=new Q3();
//        System.out.println("Protected access variables: "+obj.n+", "+obj.s);
//        obj.fun();
//        TODO: Protected members cannot be accessed by outside of package except subclasses
//        TODO: protected member can be accessed within the package and outside the package but within the child classes
    }
}
class sub_2 extends Q3
{
    public static void main(String[] args) {
        sub_2 obj=new sub_2();
        System.out.println("Protected access variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
