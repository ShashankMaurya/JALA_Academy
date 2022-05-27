package lab2_Operators;

public class Q5 {
    public static void main(String[] args) {
        int x=25, y=50;
        if(x==25 && y==60)
            System.out.println("This will be printed if both conditions are true");
        if(x==25 || y==60)
            System.out.println("This will be executed if any one of the conditions are true");
        if(!(x==25 && y==50))
            System.out.println("This statement will be executed if any one of the condition is false");
    }
}
