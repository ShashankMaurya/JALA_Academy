package lab6_Strings;

public class Q7 {
    public static void main(String[] args) {
        String s1 = "Comparing strings";
        String s2 = "Comparing Strings";

        System.out.println("Equals : " + s1.equals(s2));

        System.out.println("Equals (ignore case) : " + s1.equalsIgnoreCase(s2));

        System.out.println("Starts with : " + s1.startsWith("Comp"));

        System.out.println("Ends with : " + s1.endsWith("ings"));

        System.out.println("Compared : " + s1.compareTo(s2));
    }
}
