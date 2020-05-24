package day1.day23_Thread;

public class ThreadYieldDemo {
    public static void main(String[] args){
        ThreadYield ty = new ThreadYield();
        ThreadYield ty1 = new ThreadYield();

        ty.setName("aha");
        ty1.setName("yian");

        ty.start();
        ty1.start();
    }
}
