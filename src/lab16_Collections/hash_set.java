package lab16_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) throws IOException {
        HashSet<String> hash = new HashSet<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight"));
        int i=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("HashSet: "+ hash);

        hash.add("nine");
        System.out.println(++i +". Updated HashSet: "+ hash);

        Iterator<String> it =hash.iterator();
        System.out.print(++i +". Printing using Iterator object: ");
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println("\n"+ ++i+". Clone of HashSet: "+hash.clone());

        System.out.print(++i +". Enter the value to be removed: ");
        String s= br.readLine();
        System.out.println("Remove success: "+hash.remove(s));
        System.out.println("Updated HashSet: "+hash);

        System.out.println(++i+". Is the HashSet empty: "+hash.isEmpty());

        System.out.println(++i+". Size of the HashSet: "+hash.size());

        System.out.print(++i +". Enter the value: ");
        s= br.readLine();
        System.out.println("HashSet contains the Value: "+hash.contains(s));

        hash.clear();
        System.out.println(++i +". Updated HashSet: "+ hash);
    }
}
