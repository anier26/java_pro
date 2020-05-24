package day1.lesson1;

/**
 * byte/short/char参加运算会默认转换为int类型
 *
 * byte/short/char相互之间不转换,他们参与运算首先转换为int类型
 *
 * byte/short/char/int/long/float/double
 *
 * 常量相加先做运算,拿到结果后进行比较,当结果在目标类型范围中,则不发生类型转换,
 * 当结果超过了目标类型,则会发生类型转换
 *
 *  byte b3 = 1 +2; 1,2是常量,在编译期间就能确定结果3,又因为3没有超出byte的范围,
 *                  所以赋值给int类型和byte类型的变量都不会报错
 *
 *  byte b6 = (byte) (127+1); // 当范围超过byte以后会自动转换成int
 *
 * 变量相加先发生类型转换在运算
 *  byte b4 = b1 + b2;  变量会自动转换成int类型再相加,int类型相加结果还是int类型
 *  byte b4 = (byte) (b1 + b2);     所以从高类型转换成低类型会报错
 *
 */


public class day5_class {
    public static void main(String[] args){

        byte b1 = 1;
        byte b2 = 2;
        /** 1,2是常量,在编译期间就能确定结果3,又因为3没有超出byte的范围,
         *  所以继续赋值给byte类型的变量不会报错
         */
        byte b3 = 1 +2;
        byte b5 = 3;
//        byte b6 = 127+1; // 当超过byte以后会自动转换成int
        byte b6 = (byte) (127+1); // 当超过byte以后会自动转换成int


        // 不兼容的类型: 从int转换到byte可能会有损失,byte和int做运算会发生自动类型转换
        // 会自动转换成int类型,所以从高类型转换成低类型会报错
//        byte b4 = b1 + b2;
        byte b4 = (byte) (b1 + b2);
        int i1 = b5;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(i1);
        System.out.println(b6);
    }
}
