package day1.day23_Thread;

public class MyThreadDemo {
    public static void main(String[] args){
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();
    }
}
