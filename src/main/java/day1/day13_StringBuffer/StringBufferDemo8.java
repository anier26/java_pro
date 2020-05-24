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

public class StringBufferDemo8 {
    public static void main(String[] args) {

        int[] arr ={11,22,33,55,66};
        System.out.println(getArray(arr));
    }

    public static String getArray(int[] arr){
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("[");
        for(int x=0; x<arr.length; x++){
            if (x == arr.length -1){
                stringBuffer.append(arr[x]).append("]");
            }else {
                stringBuffer.append(arr[x]).append(", ");
            }
        }

        return stringBuffer.toString();
    }
}
