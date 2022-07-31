package multithread;

public class AppModified {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new NewThread();

        //Setting custom name instead of default name
        t1.setName("Thread test jarvis but modified");

        //Setting custom priority instead of default priority
        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Current thread before start " + Thread.currentThread().getName() +
                " priority " + Thread.currentThread().getPriority());
        t1.start();
        System.out.println("Current thread after start " + Thread.currentThread().getName() +
                " priority " + Thread.currentThread().getPriority());
        Thread.sleep(1000);
    }

    public static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Current thread " + Thread.currentThread().getName() +
                    " priority " + Thread.currentThread().getPriority());
        }
    }
}
