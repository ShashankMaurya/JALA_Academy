package lab15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Q1 {
    public static void main(String[] args) {
        try{
            File f=new File("src\\lab15_JavaIO\\files\\passage.txt");
            InputStream is=new FileInputStream(f);
            int i;
            while((i=is.read())!=-1)
                System.out.print((char)i);
            is.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
