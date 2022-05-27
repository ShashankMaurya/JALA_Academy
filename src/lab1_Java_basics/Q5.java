package lab1_Java_basics;

public class Q5 {
    int x=75;
    void fun()
    {
        int x=69;
        System.out.println("local: "+x);
        System.out.println("Global: "+this.x);
    }
    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.fun();
    }
}
