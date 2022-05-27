package lab2_Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 2 numbers:- ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        if(a==b)
            System.out.println("Both are Equal");
        else
            System.out.println("Both are not equal");
    }
}
