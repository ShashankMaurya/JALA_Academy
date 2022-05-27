package lab3_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        switch (n % 2) {
            case 0 -> System.out.println("Even number");
            case 1 -> System.out.println("Odd number");
        }
    }
}
