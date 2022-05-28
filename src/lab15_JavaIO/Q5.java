package lab15_JavaIO;

import java.io.File;
import java.io.FileReader;

public class Q5 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\passage.txt");
            FileReader fr=new FileReader(f);
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
