package playground;

public class MyRunnable implements Runnable {
    MyRunnable() {
        System.out.println("From runnable constr");
    }
    @Override
    public void run() {
        System.out.println("From runnable");
    }
}

