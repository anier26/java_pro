package day1.day23_Thread;

public class MyThread2 extends Thread {
    public MyThread2(){}

    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int x=0; x<200; x++){
            System.out.println(getName()+":"+x);
        }
    }

}
