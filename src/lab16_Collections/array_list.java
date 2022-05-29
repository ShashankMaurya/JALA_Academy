package lab16_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class array_list {
    public static void main(String[] args) throws IOException {
        int i=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("zero", "ONE", "two", "three", "four", "five", "six", "seven", "eight"));
        System.out.println("ArrayList: "+ arr);

        arr.add("nine");
        System.out.println(++i +". Updated ArrayList: "+ arr);

        Iterator<String> it =arr.iterator();
        System.out.print(++i +". Printing using Iterator object: ");
        while(it.hasNext())
            System.out.print(it.next()+" ");

        arr.add(1, "temporary_data");
        System.out.println("\n"+ ++i +". Updated ArrayList: "+ arr);

        arr.remove(1);
        System.out.println(++i +". Updated ArrayList: "+ arr);

        arr.set(1, "one");
        System.out.println(++i +". Updated ArrayList: "+ arr);

        System.out.print(++i +". Enter the element you're searching for: ");
        String s=br.readLine();
        System.out.println("Element found at index "+ arr.indexOf(s));

        System.out.print(++i +". Enter the index: ");
        int n= Integer.parseInt(br.readLine());
        System.out.println("Element at index "+n+" is "+arr.get(n));

        System.out.println(++i +". Size of the ArrayList is "+arr.size());

        System.out.print(++i +". Enter element: ");
        s=br.readLine();
        System.out.println("Element found at index "+ arr.contains(s));

        arr.clear();
        System.out.println(++i +". Updated ArrayList: "+ arr);
    }
}
