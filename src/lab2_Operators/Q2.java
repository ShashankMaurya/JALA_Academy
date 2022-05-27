package lab2_Operators;

public class Q2 {
    int op(int x, boolean f)
    {
        return f?++x:--x;
    }

    public static void main(String[] args) {
        Q2 obj=new Q2();
        int x=5;
        System.out.println("Increment: "+obj.op(x,true));
        System.out.println("Decrement: "+obj.op(x,false));
    }
}
