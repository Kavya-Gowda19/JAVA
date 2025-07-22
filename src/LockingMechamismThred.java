package MultiThreading;
class Candidate extends Thread{
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+"has enter the interview cabin.");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"is giving interview inside the cabin.");
            Thread.sleep(7000);
            System.out.println(Thread.currentThread().getName()+"has completed the interview and excied interview");
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class LockingMechamismThred {
    public static void main(String[] args) {
        Candidate c1=new Candidate();
        c1.setName("Tushar ");
        Candidate c2=new Candidate();
        c2.setName("Maha ");
        Candidate c3=new Candidate();
        c3.setName("Yogesh ");
        c1.start();
        c2.start();
        c3.start();

    }
}
