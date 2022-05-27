package lab4_Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int s=0;
        for (int i : arr)
            s += i;
        System.out.println("Average: "+s/arr.length);
    }
}
