package day1.day12_String;

import java.util.Scanner;

public class StringTest {

    private static final class Guess {

        public static void Guessum() {
            System.out.println("欢迎进入猜数字游戏: ");
            int guessNumber = (int)(Math.random()*100) + 1;
            int count =0;
            while (count <3){
                System.out.println("请输入您要猜的数字: ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                if(guessNumber == number){
                    System.out.println("猜中");
                    break;
                }else {
                    if(guessNumber > number){
                        System.out.println("猜小了");
                    }
                    else {
                        System.out.println("猜大了");
                    }
                }
                count ++;
            }
        }
    };

    public static void main(String[] args) {
        String user = "admin";
        String pass = "admin";
        int count = 0;

        while (count <3){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名: ");
            String userName = sc.nextLine();
            System.out.println("请输入密码: ");
            String passWord = sc.nextLine();
            if(userName.equals(user)  && passWord .equalsIgnoreCase(pass)){
                System.out.println("登录成功");
                Guess.Guessum();
                break;
            }

            if (2 - count == 0){
                System.out.println("账号锁定");
                break;
                }else {
                    System.out.println("用户名或密码错误");
                    System.out.println("还有2-" + count + "次机会");
            }
            count++;
        }
    }
}
