
package MultiThreading;
import java.util.Scanner;
class Operation1 extends Thread {
    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Addition Operation Started");
        System.out.println("Enter the number:");
        int n1 = s.nextInt();
        System.out.println("Enter the number:");
        int n2 = s.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
        System.out.println("Addition Operation");
    }
}
class Operation2 extends Thread {
        @Override
    public void run() {
        try {
            System.out.println("printing opertion started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi from print");
                Thread.sleep(4000);
            }
            System.out.println("printing opertion completed");
        }
            catch(Exception e){
            e.printStackTrace();
            }
        }
}
class Operation3 extends Thread {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("printing operation completed");
        System.out.println("banking operation started");
        System.out.println("enter user name: ");
        String uname = s.next();
        System.out.println("enter pin: ");
        int pin = s.nextInt();
        if (uname.equals("abc") && pin == 123) {
            System.out.println("valid user");
        } else {
            System.out.println("invalid user");
        }
        System.out.println("banking completed");
    }
}
    public class MultithreadingExample {
        public static void main(String args[]) {
            Operation1 op1 = new Operation1();
            op1.setName("add");
            Operation2 op2 = new Operation2();
            op2.setName("print");
            Operation3 op3 = new Operation3();
            op3.setName("bank");
            op1.start();
            op2.start();
            op3.start();

        }
    }



