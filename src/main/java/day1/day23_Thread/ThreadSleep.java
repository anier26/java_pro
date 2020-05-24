package day1.day23_Thread;

import java.util.Date;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for(int x=0; x<100; x++){
            System.out.println(getName()+ ":" + x + ",日期: " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
