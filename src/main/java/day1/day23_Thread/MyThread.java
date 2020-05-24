package day1.day23_Thread;

/**
 * 多线程程序
 *
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int x=0; x<100;x++){
            System.out.println(x);
        }
    }
}
