package lab3_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        int temp=n,s=0;
        while(temp>0)
        {
            s+=Math.pow(temp%10,3);
            temp/=10;
        }
        if(s==n)
            System.out.println(n+" is an Armstrong number.");
        else
            System.out.println(n+" is not an Armstrong number.");
    }
}
