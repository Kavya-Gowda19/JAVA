package CollectionFramework;
import java.util.LinkedList;
public class linkedlist {
   public static void main(String args[]) {
       LinkedList<String> cars = new LinkedList<String>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("Mazda");
       System.out.println(cars);

       cars.addFirst("omini");
       System.out.println(cars);

       cars.addLast("toyota");
       System.out.println(cars);

       cars.removeFirst();
       System.out.println(cars);

       cars.removeLast();
       System.out.println(cars);

       System.out.println(cars.getFirst());

       System.out.println(cars.getLast());

       LinkedList<String> valid=new LinkedList<String>();
       valid.add("omini");
       valid.add("bike");
       valid.add("Ford");
       valid.add("Mazda");
       cars.retainAll(valid);
       System.out.println(cars);
       //The retainAll() method keeps only the elements in cars that are also in valid, and removes all others.

      LinkedList cars1=(LinkedList)cars.clone();
      cars1.set(0,"hero");
       System.out.println(cars);
       System.out.println(cars1);
       System.out.println(valid);

       valid.addAll(cars1);
       System.out.println(valid);
   }


   }

