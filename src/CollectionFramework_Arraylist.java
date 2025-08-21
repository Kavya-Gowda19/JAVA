package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
  public static void main(String args[]){


        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("bmw");
        Cars.add("audi");
        Cars.add("toyota");
        Cars.add("mercedes");
        Cars.add("honda");
        Cars.add("ford");
        Cars.set(1, "omini");

        System.out.println(Cars.get(0));
        System.out.println(Cars);

        System.out.println("=========size========");
        System.out.println(Cars.size());

        System.out.println("=========remove=======");
        Cars.remove(5);
        System.out.println(Cars);
        //Cars.removeAll(Cars);
        //System.out.println(Cars);
        System.out.println("=========clear=======");
        //Cars.clear;
      //============================================
        for(int i=0;i<Cars.size();i++){
              System.out.println(Cars.get(i));
        }

        System.out.println("=========clone=========");
        ArrayList Cars2 = (ArrayList) Cars.clone();
        Cars2.set(0, "KN");
        System.out.println(Cars);
        System.out.println(Cars2);


        System.out.println("=========contains=======");
        System.out.println(Cars2.contains("omini"));


        System.out.println("=========indexOf=======");
        System.out.println(Cars.indexOf("omini"));


        System.out.println("=========Empty=======");
        System.out.println(Cars.isEmpty());


        System.out.println("=========subList=======");
        System.out.println(Cars.subList(1, 3));


        System.out.println("=========arrayList=======");
        Object[] CarsArray = Cars.toArray();
        for (Object i : CarsArray) {
          System.out.println(i);
        }


        System.out.println("=========trimToSize()=======");
        Cars.trimToSize();
        System.out.println(Cars);


        System.out.println("=========clear=======");
        // Cars.clear();

        for (int i = 0; i < Cars.size(); i++) {
          System.out.println(Cars.get(i));
        }

        // Sort
        System.out.println("=========sort=======");
        Collections.sort(Cars); // Case matters
        for (String i : Cars) {
          System.out.println(i);
        }

        // addAll
        System.out.println("=========addAll=======");
        ArrayList<String> brand = new ArrayList<String>();
        brand.add("a");
        brand.add("b");
        brand.add("c");
        brand.addAll(Cars);
        System.out.println(brand);

        brand.addAll(2, Cars); // cars from position 2
        System.out.println(brand);


      }
    }




