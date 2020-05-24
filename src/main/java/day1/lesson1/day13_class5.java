package day1.lesson1;

/**
 * continue: 继续:
 * 使用场景:
 *    循环中,离开此场景无意义
 *
 * 跳出一次循环,进入下一次的执行
 *
 */

public class day13_class5 {
    public static void main(String[] args) {
//        for(int x=0; x<10; x++){
//            if(x == 3){
//                continue;
//            }
//            System.out.println(x); //0 1 2 4 5 6 7 8 9 x=3时候跳出本次循环,进入下次循环
//        }
        for(int x=1; x<=10; x++){
            if(x %3 ==0){
                System.out.println("基础班");
            }
            System.out.println("基础班");
        }
    }
}