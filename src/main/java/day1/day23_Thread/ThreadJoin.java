package day1.day23_Thread;

public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for(int x=0; x<100; x++){
            System.out.println(getName() + ":" + x);
        }
    }
}
