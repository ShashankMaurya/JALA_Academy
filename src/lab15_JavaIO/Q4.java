package lab15_JavaIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Q4 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\appendix2.txt");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f));
            bos.write("Hello world! this is written using BufferedOutputStream".getBytes(StandardCharsets.UTF_8));
            System.out.println("Data written in file successfully");
            bos.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
