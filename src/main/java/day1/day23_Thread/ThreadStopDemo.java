package day1.day23_Thread;

public class ThreadStopDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadStop ts = new ThreadStop();
        ts.start();
        Thread.sleep(3000);
//        ts.stop();
        ts.interrupt();
    }
}

