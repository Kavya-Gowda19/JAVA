package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String args[]) {
        Queue<String> q = new LinkedList<>();
        System.out.println(q);
 //add elements to the queue
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        System.out.println(q);

        // remove the element at the front of the queue
        String front =q.remove();
        System.out.println(front);
        System.out.println(q);

// add another element to the queue
        q.add("date");

        // peek/returns at the element at the front of the queue
        String peeked = q.peek();
        System.out.println(peeked);
        System.out.println(q);

        // To remove the head of queue
        String removedele = q.remove();
        System.out.println(removedele);
        System.out.println(q);

        q.remove("date");
        System.out.println(q);


    }
}
