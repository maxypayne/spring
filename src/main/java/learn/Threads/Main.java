package learn.Threads;

import static learn.Threads.ThreadColor.ANSI_BLUE;

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
        Thread MyRunnableThread = new Thread(new MyRunnable());
        MyRunnableThread.start();

        first.interrupt();
        System.out.println(ANSI_BLUE + "Soumu");
    }
}
