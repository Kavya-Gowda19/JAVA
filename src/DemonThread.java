package MultiThreading;



class micro extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("typing"))
            typing();
        else if(Thread.currentThread().getName().equals("checking"))
            checking();
        else
            saving();
    }
    public void typing() {
        try {
            for(int i=1;i<=5;i++) {
                System.out.println("typing...");
                Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void checking() {
        try {
            for(;;) {
                System.out.println("checking...");
                Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void saving() {
        try {
            for(;;) {
                System.out.println("saving...");
                Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class demonthread {

    public static void main(String[] args) {
        micro ms1=new micro();
        ms1.setName("typing");
        micro ms2=new micro();
        ms2.setName("checking");
        micro ms3=new micro();
        ms3.setName("saving");
        ms2.setDaemon(true);
        ms3.setDaemon(true);
        ms2.setPriority(8);
        ms3.setPriority(9);
        ms1.start();
        ms2.start();
        ms3.start();
    }
}
