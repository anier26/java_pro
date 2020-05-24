package day1.day23_Thread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int x=0; x<200; x++){
            System.out.println(getName()+":"+x);
        }
    }

}
