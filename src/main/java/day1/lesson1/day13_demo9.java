package day1.lesson1;

/**
 * 每天2.5元零花钱
 * 这天是5或者5的倍数, 总钱-6元
 * 要多少天可以存到100
 *
 */

public class day13_demo9 {
    public static void main(String[] args) {
        double day_m =2.5;
        double sum_m = 0;
        int count = 1; //从第一天开始存钱,不能从第0天开始存

        while (true){
            sum_m += day_m;

            if(sum_m >=100){
                break;
            }

            if(count %5 ==0){
                sum_m -=6;
            }

            //天数变化
            count ++;
            System.out.println("sum_m: " +sum_m);
        }
        System.out.println("count: " + count);

    }
}