package lab6_Strings;

public class Q6 {
    public static void main(String[] args) {
        String s = "Matching a String";
        boolean match = s.matches("(.*)a(.*)");
        System.out.println("regex Matches : " + match);
    }
}
