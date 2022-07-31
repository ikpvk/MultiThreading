package multithread;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Current thread " + Thread.currentThread().getName());
            }
        });

        System.out.println("Current thread before start " + Thread.currentThread().getName());
        t1.start();
        System.out.println("Current thread after start " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
