package lab15_JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Q2 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\appendix.txt");
            OutputStream os=new FileOutputStream(f);
            os.write("Hello world! this is written using FileOutputStream".getBytes(StandardCharsets.UTF_8));
            System.out.println("Data written in file successfully");
            os.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
