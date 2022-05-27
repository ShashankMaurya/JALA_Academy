package lab14_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q11 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("Random path"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException caught");
        }
    }
}
