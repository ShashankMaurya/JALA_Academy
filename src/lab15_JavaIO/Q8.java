package lab15_JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Q8 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\appendix4.txt");
            BufferedWriter bw =new BufferedWriter(new FileWriter(f));
            bw.write("Hello world! this is written using BufferedWriter");
            System.out.println("Data written in file successfully");
            bw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
