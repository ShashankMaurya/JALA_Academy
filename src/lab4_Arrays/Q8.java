package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    static int min(int[] arr) {
        int m = arr[0];
        for (int i : arr)
            if (i < m)
                m = i;
        return m;
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int i : arr)
            if (i > m)
                m = i;
        return m;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Maximum value: "+max(arr));
        System.out.println("Minimum value: "+min(arr));
    }
}
