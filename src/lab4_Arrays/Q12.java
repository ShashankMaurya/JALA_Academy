package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
    static void removeDuplicate(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=j+1;k<n;k++)
                        arr[k-1]=arr[k];
                    n--;
                }
                else
                    j++;
            }
        }
        System.out.print("Updated array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+", ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        removeDuplicate(arr);
    }
}
