package day1.day13_StringBuffer;

/**
 * StringBuffer: 线程安全的可变字符串
 * StringBuffer 和String的区别:
 *    前者长度可变,后者长度不可变
 *    如果使用前者做字符串拼接,不会浪费太多资源
 *
 * StringBuffer的构造方法:
 *    public StringBuffer()  --- >>无参构造
 *    public StringBuffer(int capacity): 指定容量的字符串缓冲区对象
 *    public StringBuffer()指定字符串内容的字符串缓冲区对象
 */
public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("stringBuffer: " + stringBuffer);

        System.out.println(stringBuffer.capacity()); //16
        System.out.println(stringBuffer.length());  //0
        System.out.println("===============");

        StringBuffer stringBuffer1 = new StringBuffer(56);
        System.out.println(stringBuffer1.capacity());  //56
        System.out.println(stringBuffer1.length()); //0

        System.out.println("===============");
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        System.out.println("stringBuffer2: " + stringBuffer2.length()); //5
        System.out.println("stringBuffer2: " + stringBuffer2.capacity()); // 21  16+5
        System.out.println("stringBuffer2: " + stringBuffer2); //hello

    }
}
