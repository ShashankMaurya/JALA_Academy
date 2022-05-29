package lab16_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hash_map {
    public static void main(String[] args) throws IOException {
        int i=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "Steve");
        hash.put(2, "Sharon");
        hash.put(3, "Margaret");
        hash.put(4, "Richards");
        hash.put(5, "Maxwell");
        hash.put(6, "Tony");
        hash.put(7, "Natasha");
        hash.put(8, "Bruce");
        hash.put(9, "Samuel");
        hash.put(10, "Natalie");
        System.out.println("HashMap: "+hash);

        hash.put(0, "Carol");
        System.out.println(++i+". Updated HashMap: "+hash);

        System.out.print(++i +". Enter the key: ");
        int n= Integer.parseInt(br.readLine());
        System.out.println("Value: "+hash.get(n));

        System.out.println(++i+". Clone of HashMap: "+hash.clone());

        System.out.print(++i +". Enter the key: ");
        n= Integer.parseInt(br.readLine());
        System.out.println("HashMap contains the key: "+hash.containsKey(n));

        System.out.print(++i +". Enter the value: ");
        String s= br.readLine();
        System.out.println("HashMap contains the Value: "+hash.containsValue(s));

        System.out.println(++i+". Is the HashMap empty: "+hash.isEmpty());

        System.out.println(++i+". Size of the HashMap: "+hash.size());

        System.out.println(++i+". Keys of HashMap: "+hash.keySet());

        System.out.println(++i +". Enter the key-value pair to be removed: ");
        n=Integer.parseInt(br.readLine());
        s= br.readLine();
        System.out.println("Remove success: "+hash.remove(n,s));
        System.out.println("Updated HashMap: "+hash);

        HashMap<Integer, String> newhash = new HashMap<>();
        newhash.putAll(hash);
        System.out.println(++i+". New HashMap: "+newhash);
    }
}
