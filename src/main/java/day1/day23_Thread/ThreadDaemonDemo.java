package day1.day23_Thread;

public class ThreadDaemonDemo {
    public static void main(String[] args){
        ThreadDaemon tm1 = new ThreadDaemon();
        ThreadDaemon tm2 = new ThreadDaemon();

        tm1.setName("aha");
        tm2.setName("yian");

        tm1.setDaemon(true);
        tm2.setDaemon(true);

        tm1.start();
        tm2.start();

        Thread.currentThread().setName("anan");
        for (int x=0; x<5; x++){
            System.out.println(Thread.currentThread().getName() + ": " + x);
        }
    }
}
