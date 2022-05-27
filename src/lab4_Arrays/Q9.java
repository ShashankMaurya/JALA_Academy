package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9 {
    static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        int j = arr.length-1;
        for (int i : arr)
            rev[j--] = i;
        return rev;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Reversed Array: " + Arrays.toString(reverse(arr)));
    }
}
