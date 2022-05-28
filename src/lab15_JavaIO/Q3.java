package lab15_JavaIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Q3 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\passage.txt");
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
            int i;
            while((i=bis.read())!=-1)
                System.out.print((char)i);
            bis.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
