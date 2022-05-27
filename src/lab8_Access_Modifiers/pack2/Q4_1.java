package lab8_Access_Modifiers.pack2;

import lab8_Access_Modifiers.Q4;

public class Q4_1 {
    public static void main(String[] args) {
        Q4 obj=new Q4();
        System.out.println("Public access variables: "+obj.n+", "+obj.s);
        obj.fun();
    }
}
