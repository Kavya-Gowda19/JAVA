package MultiThreading;

class queue1 {
    int x;
    boolean value_in_x = false;

    synchronized public void put(int i) {//synochronized is used for lock
        try {
            if (value_in_x == false) {
                x = i;
                System.out.println("I have produced the value " + i + " into x");
                value_in_x = true;
                notify();//remove from lock stage
            } else {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void get() {
        try {
            if (value_in_x == true) {
                System.out.println("I have consumed the value " + x + " from x");
                value_in_x = false;
                notify();//remove from lock stage
            } else {
                wait();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Producer1 extends Thread{
    queue1 a;
    public Producer1(queue1 q1){
        a=q1;
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            a.put(i++);
        }
    }
}

class Consumer1 extends Thread{
    queue1 b;
    public Consumer1(queue1 q1){
        b = q1;
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            b.get();
        }
    }
}
public class ProducerConsumer1 {
    public static void main(String[] args) {
        queue1 q1=new queue1();
        Producer1 p1=new Producer1(q1);
        Consumer1 c1=new Consumer1(q1);
        p1.start();
        c1.start();
    }
}

