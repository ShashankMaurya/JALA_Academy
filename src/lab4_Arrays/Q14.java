package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
    static int even(int[] arr){
        int c=0;
        for(int i : arr)
            if(i%2==0)
                c++;
        return c;
    }
    static int odd(int[] arr){
        int c=0;
        for(int i : arr)
            if(i%2!=0)
                c++;
        return c;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("No. of even numbers: "+ even(arr));
        System.out.println("No. of odd numbers: "+ odd(arr));
    }
}
