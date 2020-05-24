package day1.lesson6;

public class MathDemo {
    public static void main(String[] args){
        for (int x=0; x<100; x++){
            int num = (int)(Math.random()*100)+ 1;
            System.out.println("num:" + num);
        }
    }
}
