package lab3_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    boolean prime(int n){
        boolean f=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=false;
                break;
            }
        }
        return f;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        Q9 obj=new Q9();
        if(obj.prime(n))
            System.out.println(n+" is Prime.");
        else
            System.out.println(n+" is not prime.");
    }
}
