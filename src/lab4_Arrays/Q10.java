package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    static void duplicate(int[] arr) {
        System.out.print("Duplicate values : ");
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    System.out.print(arr[j] + ", ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        duplicate(arr);
    }
}
