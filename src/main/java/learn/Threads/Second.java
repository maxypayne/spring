package learn.Threads;


public class Second extends  Thread {
    @Override
    public void run() {
        System.out.println("From second");
    }
}
