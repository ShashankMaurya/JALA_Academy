package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
        static int secondLargest(int[] arr) {
            int temp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr[arr.length-2];
        }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Second largest number: "+secondLargest(arr));
    }
}
