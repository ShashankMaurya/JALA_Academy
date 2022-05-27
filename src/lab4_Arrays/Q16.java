package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16 {
    static void check(int[] arr)
    {
        boolean b1 = false, b2 = false;
        for (int i: arr)
        {
            if(i==12)
                b1=true;
            else if(i==23)
                b2=true;
        }
        if(b1 && b2)
            System.out.println("Both are in the array.");
        else if(b1)
            System.out.println("12 is in the array.");
        else if (b2)
            System.out.println("23 is in the array.");
        else
            System.out.println("None is in the array.");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the array elements:- ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        check(arr);
    }
}
