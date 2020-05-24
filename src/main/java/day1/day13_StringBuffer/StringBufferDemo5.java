package day1.day13_StringBuffer;

/**
 * StringBuffer: 线程安全的可变字符串
 * StringBuffer 和String的区别:
 *    前者长度可变,后者长度不可变
 *    如果使用前者做字符串拼接,不会浪费太多资源
 *
 *   public StringBuffer deleteCharAt(int index); 删除指定位置的字符,并返回缓冲区本身
 *   public StringBuffer delete(int start, int end): 删除从指定位置开始到指定位置结束的内容,并返回缓冲区本身
 *
 *
 */

public class StringBufferDemo5 {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello").append("world");
        System.out.println("StringBuffer: " + stringBuffer); //StringBuffer: helloworld
        System.out.println("========================");
//        stringBuffer.deleteCharAt(5);
//        System.out.println("StringBuffer: " + stringBuffer); //StringBuffer: helloorld

        stringBuffer.delete(5,10);
        System.out.println("StringBuffer: " + stringBuffer);

    }
}
