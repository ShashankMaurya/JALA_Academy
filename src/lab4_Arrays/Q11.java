package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
    static void commonVal(int[] arr1, int[] arr2) {
        System.out.print("Common values : ");
        for (int i : arr1)
            for (int j : arr2)
                if (i == j)
                    System.out.print(i+", ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter both array size: ");
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int[] arr1 =new int[n1];
        int[] arr2 =new int[n2];
        System.out.println("Enter the array#1 elements:- ");
        for(int i=0;i<n1;i++)
            arr1[i]=Integer.parseInt(br.readLine());
        System.out.println("Enter the array#2 elements:- ");
        for(int i=0;i<n2;i++)
            arr2[i]=Integer.parseInt(br.readLine());
        commonVal(arr1, arr2);
    }
}
