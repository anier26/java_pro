package day1.day23_Thread;

public class SellTicketDemo {
    public static void main(String[] args){

        //创建三个线程对象:
        SellTicket st1 = new SellTicket();
        SellTicket st2 = new SellTicket();
        SellTicket st3 = new SellTicket();

        //给线程对象起名字
        st1.setName("窗口1");
        st1.setName("窗口2");
        st1.setName("窗口3");

        //启动线程:
        st1.start();
        st2.start();
        st3.start();


    }
}
