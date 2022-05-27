package lab2_Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.println("Enter the numbers:- ");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        if(a>b)
            System.out.println(a+" is greater and "+b+" is smaller");
        else
            System.out.println(b+" is greater and "+a+" is smaller");
    }
}
