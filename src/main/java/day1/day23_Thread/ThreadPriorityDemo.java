package day1.day23_Thread;

public class ThreadPriorityDemo {
    public static void main(String[] args){
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("aha");
        tp2.setName("yian");
        tp3.setName("duoduo");

        tp1.setPriority(10);
        tp2.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
