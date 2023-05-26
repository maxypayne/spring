package learn.Threads;

public class Handler {
    public static void main(String[] args) {
        Thread first = new First();
        first.start();
        Thread second = new Second();
        second.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println("From anonymous");
            }
        }.start();
    }
}
