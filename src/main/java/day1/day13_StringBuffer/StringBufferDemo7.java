package day1.day13_StringBuffer;

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

public class StringBufferDemo7 {
    public static void main(String[] args){
        String s ="hello";
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println("stringBuffer: " + stringBuffer);
        System.out.println("=====================");
        //方式二:
        String s2 = "Javase";
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(s2);
        System.out.println("stringBuffer1"+stringBuffer1);
        System.out.println("=====================");

//        stringBuffer ---- >> String:
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("hello").append("world").append("JAVA");

        String str = stringBuffer2.substring(5,10);
        System.out.println("str: " + str);

        StringBuffer stringBuffer3 = new StringBuffer("hello");
        String str2 = String.valueOf(stringBuffer3);
        System.out.println("str2: " + str2);

        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("JAVASE").append("JAVAEE").append("HELLO");
        String str3 = stringBuffer5.toString();
        System.out.println("str3: " + str3);

        String str5 = new String(stringBuffer5);
        System.out.println("str5: " + str5);

    }
}
