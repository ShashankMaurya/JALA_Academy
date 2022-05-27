package lab6_Strings;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        String s = "Splitting String";
        String[] spl = s.split(" "); //splits space

        System.out.println("Splitted: "+ Arrays.toString(spl));
    }
}
