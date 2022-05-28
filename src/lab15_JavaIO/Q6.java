package lab15_JavaIO;

import java.io.File;
import java.io.FileWriter;

public class Q6 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\appendix3.txt");
            FileWriter fw=new FileWriter(f);
            fw.write("Hello world! this is written using FileWriter");
            System.out.println("Data written in file successfully");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
