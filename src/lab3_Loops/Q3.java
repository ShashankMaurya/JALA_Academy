package lab3_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 2 numbers:- ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        if(a==b)
            System.out.println("Both are Equal");
        if(a!=b)
            System.out.println("Both are not equal");
    }
}
