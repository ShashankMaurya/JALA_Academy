package lab15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Q9 {
    public static void main(String[] args) {
        try {
            File f=new File("src\\lab15_JavaIO\\files\\Prop_appendix.txt");
            FileInputStream fis = new FileInputStream(f);
            Properties prop=new Properties();
            prop.load(fis);
            System.out.println("Name: "+prop.getProperty("Name"));
            System.out.println("Roll: "+prop.getProperty("Roll"));
            System.out.println("College: "+prop.getProperty("College"));
            fis.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
