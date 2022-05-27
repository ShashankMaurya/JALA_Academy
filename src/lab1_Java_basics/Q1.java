package lab1_Java_basics;

public class Q1 // class
{
    int x=69;  //data member
    public void fun()  //member method
    {
        x=75;
    }
    public static void main(String[] args) // main method
    {
        Q1 obj=new Q1();  // object creation
        System.out.println(obj.x);  // accessing data members with object of that class
        obj.fun(); // accessing member method with object of that class
        System.out.println(obj.x);
    }
}
