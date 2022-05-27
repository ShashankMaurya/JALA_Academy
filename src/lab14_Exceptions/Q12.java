package lab14_Exceptions;

import java.io.*;

public class Q12 {
    public static void main(String[] args) {
        File file=new File("test.txt");
        FileInputStream f=null;
        try {
            f=new FileInputStream(file);
            int x=f.read();
            f.close();
        }
        catch (IOException e)
        {
            System.out.println("IOException caught");
        }
    }
}
