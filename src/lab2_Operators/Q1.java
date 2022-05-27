package lab2_Operators;

public class Q1 {
    void op(int a, int b)
    {
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        obj.op(10,5);
    }
}
