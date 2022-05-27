package lab4_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) throws IOException {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.print("Enter the value: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for (int i : arr) {
            if (i == x) {
                System.out.println("Yes, it contains the value.");
                break;
            }
        }
    }
}
