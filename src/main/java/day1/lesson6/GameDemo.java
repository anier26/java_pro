package day1.lesson6;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count =1;
        int number = (int) (Math.random()*100) +1;

        while (count<=3){
            System.out.println("请输入你要猜的数据:");
            int guessNum = sc.nextInt();
            count ++;

            if( guessNum == number){
                System.out.println("猜中了");
                break;
            }else if(guessNum > number){
                System.out.println("猜大了");
            }else{
                System.out.println("小了");
            }
        }

    }
}
