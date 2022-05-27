package lab4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static int[] removeElement(int[] arr, int index) {
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.print("Select an index to remove a value from array = " + Arrays.toString(arr) + ": ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Array after removing Element at index " + index);
        arr = removeElement(arr, index);
        System.out.println("new arr = " + Arrays.toString(arr));
    }
}
