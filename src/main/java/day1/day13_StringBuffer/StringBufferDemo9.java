package day1.day13_StringBuffer;

import java.util.Scanner;

/**
 * StringBuffer: 线程安全的可变字符串
 * StringBuffer 和String的区别:
 *    前者长度可变,后者长度不可变
 *    如果使用前者做字符串拼接,不会浪费太多资源
 *
 *   public StringBuffer deleteCharAt(int index); 删除指定位置的字符,并返回缓冲区本身
 *   public StringBuffer delete(int start, int end): 删除从指定位置开始到指定位置结束的内容,并返回缓冲区本身
 *   replace(int start, int end, String str)
 *   public String substring(int start)
 *   public String substring(int start, int end ) stringBuffer的截取功能返回值不在是字符串缓冲区本身,而是String类型
 *
 */

public class StringBufferDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("======================");
        System.out.println(getReverse(str));
    }

    public static String getReverse(String str){
//        StringBuffer stringBuffer = new StringBuffer(str);
//        stringBuffer.reverse();
//        return stringBuffer.toString();
        return new StringBuffer(str).reverse().toString();
    }
}
