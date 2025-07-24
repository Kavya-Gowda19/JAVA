package MultiThreading;

class queue{
     int x;
     public void put(int i){
     x=i;
         System.out.println("produced value "+i+" into x");
     }
    public void get(){

        System.out.println("I have consumed "+x+" from x");
    }
}
class Producer extends Thread{
    queue a;
    public Producer(queue q){
    a=q;
}
@Override
public void run(){
    int i=1;
    while(true){
        a.put(i++);
    }
}
}

class Consumer extends Thread{
    queue b;
    public Consumer(queue q){
    b = q;
}
@Override
public void run(){
    int i=1;
    while(true){
        b.get();
    }
}
}
public class ProducerConsumer {
    public static void main(String[] args) {
        queue q=new queue();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        p.start();
        c.start();
    }
}
