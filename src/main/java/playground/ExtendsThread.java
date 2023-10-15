package playground;

public class ExtendsThread extends Thread {
    ExtendsThread() {
        System.out.println("From extend");
        System.out.println(ExtendsThread.currentThread());
    }
}
