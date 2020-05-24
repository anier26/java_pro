package day1.day23_Thread;

public class SellTicket_RunnableDemo{
    public static void main(String[] args){
        // 创建资源对象:
        SellTicket_Runnable sr = new SellTicket_Runnable();

        //创建三个线程对象:
        Thread t1 = new Thread(sr);
        Thread t2 = new Thread(sr);
        Thread t3 = new Thread(sr);

        t1.start();
        t2.start();
        t3.start();
    }
}
