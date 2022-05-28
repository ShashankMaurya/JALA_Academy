package lab15_JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class Q10 {
    public static void main(String[] args) {
        try {
            Properties prop=new Properties();
            prop.put("Name", "Sharon");
            prop.put("Roll", "1928259");
            prop.put("College", "KIIT");
            File f=new File("src\\lab15_JavaIO\\files\\Prop_appendix.txt");
            FileOutputStream fos=new FileOutputStream(f);
            prop.store(fos,"Sample Properties file");
            System.out.println("Data written in file successfully");
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
