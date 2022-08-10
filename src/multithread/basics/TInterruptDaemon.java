package multithread.basics;

public class TInterruptDaemon {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BlockT());
        t1.setDaemon(true);
        t1.start();
        t1.interrupt();
    }

    public static class BlockT implements Runnable {
        public void run() {
            try {
                long base = 100000000;
                long power = 1000000000;
                float result = 1;
                for(long i=1; i<=power; i++) {
                    result = result * base;
                }
                System.out.println("Calculated value : "+result);
            }catch (Exception e) {
                System.out.println("Exiting");
            }
        }
    }
}
