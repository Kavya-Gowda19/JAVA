package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        hs.add(600);
        hs.add(600);
        System.out.println(hs);


        System.out.println(hs.remove(200));;
        System.out.println(hs);

        System.out.println(hs.contains(300));

        System.out.println(hs.contains(hs.isEmpty()));

        System.out.println(hs.contains(hs.size()));//true or false


        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()){
           int  num=iterator.next();
            System.out.println(num);
        }

    }
}
