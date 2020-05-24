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
 *
 *    stringBuffer 使用append()方法追加后,返回的还是字符串缓冲区本身
 */
public class StringBufferDemo2 {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("hello");
//        stringBuffer.append("world").append("java"); //stringBuffer: helloworldjava
        System.out.println("stringBuffer: " + stringBuffer); //hello
        
    }
}
