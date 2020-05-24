package day1.lesson1;

/**
 *while 循环和 for 循环的区别:
 * 如果想在循环结束后继续使用控制条件的变量,用while即可,否则用for,不知道使用for循环即可
 *
 * 使用场景:
 *    如果是一个明确的使用范围,可以用for循环,
 *    如果没有明确的循环范围,可以使用while循环
 *
 */

public class day13_demo4 {
    public static void main(String[] args) {
        int count =0;
        int count1 =0;
        for(int x=100; x<1000; x++){
            if((x%10)*(x%10)*(x%10) +(x/10%10)*(x/10%10)*(x/10%10)
                    + (x/10/10%10)*(x/10/10%10)*(x/10/10%10) == x){
                count ++;
                System.out.println(x);
            }
        }
        System.out.println("共有: " + count);

        int y=100;
        while (y<=1000){
            int ge = (y%10);
            int shi = (y/10%10);
            int bai = (y/10/10%10);

            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == y){
                System.out.println(y);
                count1++;
            }
            y++;
        }
        System.out.println("count1: " + count1);
    }
}