package lab15_JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Q7 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\passage.txt");
            BufferedReader br=new BufferedReader(new FileReader(f));
            int i;
            while((i= br.read())!=-1)
                System.out.print((char)i);
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
