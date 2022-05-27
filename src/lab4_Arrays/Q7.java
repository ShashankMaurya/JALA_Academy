package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q7 {
    static void insertElement(int[] arr, int index, int v) {
//        for (int i = index;i<arr.length; i++)
//            arr[i+1] = arr[i];
        arr[index] = v;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Enter the element and the index: ");
        int e=Integer.parseInt(br.readLine());
        int p=Integer.parseInt(br.readLine());
        insertElement(arr, p,e);
        System.out.println("Updated array: "+ Arrays.toString(arr));
    }
}
