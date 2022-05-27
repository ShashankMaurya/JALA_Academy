package lab3_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    int rev(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s*10+n%10;
            n/=10;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        Q10 obj=new Q10();
        if(n==obj.rev(n))
            System.out.println(n+" is Palindrome");
        else
            System.out.println(n+" is not Palindrome");
    }
}
