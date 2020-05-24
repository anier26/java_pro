package day1.day23_Thread;

public class ThreadSleepDemo {
    public static void main(String[] args){
        ThreadSleep ts = new ThreadSleep();
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();

        ts.setName("aha");
        ts1.setName("duoduo");
        ts2.setName("yian");

        ts.start();
        ts1.start();
        ts2.start();
    }
}
