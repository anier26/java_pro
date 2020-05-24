package day1.day13_StringBuffer;

/**
 * StringBuffer: 线程安全的可变字符串
 * StringBuffer 和String的区别:
 *    前者长度可变,后者长度不可变
 *    如果使用前者做字符串拼接,不会浪费太多资源
 *
 *  public StringBuffer insert(int offset, String str)  在指定位置吧任意类型的数据插入到字符串缓冲区里;
 *
 *
 *
 */

public class StringBufferDemo3 {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello").append(true).append(12.345);
        System.out.println(stringBuffer);
        System.out.println("=======================");
        stringBuffer.insert(5,"world");
        System.out.println(stringBuffer);

    }
}
