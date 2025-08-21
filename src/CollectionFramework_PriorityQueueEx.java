package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String args[]){
        Queue<Integer> pq=new PriorityQueue<>();

        // using add()
        pq.add(10);
        pq.add(15);
        pq.add(20);
        pq.add(25);
        pq.add(30);
        pq.add(35);


        // This method throws an exception if the queue is empty
        System.out.println( pq.element());

        // This method returns null if the queue is empty  /print to element
        System.out.println( pq.peek());



        // Removing the top element of
        pq.poll();
        System.out.println(pq);


    }
}
