package day1.day23_Thread;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin tj = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj.setName("aha");
        tj2.setName("duoduo");
        tj3.setName("yian");

        tj.start();
        tj.join();
        tj2.start();
        tj3.start();
    }
}
