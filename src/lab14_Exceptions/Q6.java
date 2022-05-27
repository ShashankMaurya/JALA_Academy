package lab14_Exceptions;

class myex extends Exception
{
    myex(String s)
    {
        System.out.println(s);
    }
}

public class Q6 {
    public static void main(String[] args) throws myex {
        throw new myex("Custom exception thrown");
    }
}
