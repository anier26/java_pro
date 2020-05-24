package day1.day23_Thread;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MyThreadDemo2 {
    public static void main(String[] args){
        MyThread2 myThread = new MyThread2("aha");
        MyThread2 myThread2 = new MyThread2("yian");

        myThread.start();
        myThread2.start();

        System.out.println("=============");
        System.out.println(Thread.currentThread().getName());
    }
}
