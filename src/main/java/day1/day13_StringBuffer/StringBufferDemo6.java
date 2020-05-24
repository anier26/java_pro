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

public class StringBufferDemo6 {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello").append("world").append(true);
        stringBuffer.replace(5,10,"jd.com");
        System.out.println("stringBuffer: " + stringBuffer); //stringBuffer: hellojd.comtrue

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("abcde");
        stringBuffer1.reverse();
        System.out.println("reverse: " +stringBuffer1); //reverse: edcba

        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Javase").append("Javaee").append("world");
//        String str = stringBuffer2.substring(6,11);
//        System.out.println("str: " + str);
//        System.out.println("stringBuffer2: " + stringBuffer2);

        String str2 = stringBuffer2.substring(6);
        System.out.println("str2: " + str2); //str2: Javaeeworld
        System.out.println("stringBuffer2: " + stringBuffer2);
    }
}
