package day1.day13_StringBuffer;

import java.util.Scanner;

/**
 *
 * String StringBuffer, StringBuilder的区别:
 *
 *  String是内容不可变的,而StringBuffer, StringBuilder的内容是可变的
 *  StringBuffer是同步的,数据安全,效率低,StringBuilder是不同步的,数据不安全,效率高
 *
 *  2.StringBuffer和数组的区别:
 *  二者都可看成一个容器,装其他数据,但是,StringBuffer的数据最终是个字符串数据
 *  而数组可以放置多种数据,只要是同一种类型即可
 *
 *
 *
 */

public class StringBufferDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("======================");
        System.out.println(getFlag(str));
//        System.out.println(getFlag2(str));
    }

    //方式一: 这个是拆出来一个一个元素比
    public static boolean getFlag(String str){
        boolean flag = false;
        StringBuffer stringBuffer = new StringBuffer(str);
        for(int x=0; x<stringBuffer.length()/2; x++){
            if(stringBuffer.charAt(x) == stringBuffer.reverse().charAt(x)){
                 flag = true;
            }
        }
        return flag;
    }

    public static  Boolean getFlag2(String str) {
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}
