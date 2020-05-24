package day1.day12_String;

public class StringDemo8 {
    public static void main(String[] args) {
        String s = "helloWorld";
        String ss = s.replace('l','k');
        System.out.println("ss: " + ss); //hekkoWorkd

        String str = s.replace("oWo","rld");
        System.out.println("str: " + str);

        String s2 = " hello world ";
        String s3 = s2.trim();
        System.out.println("s2: " + s2); //s2:  hello world
        System.out.println("s3: " + s3); //s3: hello world  trim()去除两端空格

        String str2 = "hello";
        String str3 = "hello";
        String str5 = "hel";
        String str6 = "abc";
        String str7 = "xyz";

        System.out.println(str2.compareTo(str3)); //0
        System.out.println(str2.compareTo(str5)); //2
        System.out.println(str2.compareTo(str6)); //7
        System.out.println(str2.compareTo(str7)); //-16

        /**
         * public int compareTo(String anotherString) {
         *         int len1 = value.length;
         *         int len2 = anotherString.value.length;
         *         int lim = Math.min(len1, len2);
         *         char v1[] = value;
         *         char v2[] = anotherString.value;
         *
         *         int k = 0;
         *         while (k < lim) {
         *             char c1 = v1[k];
         *             char c2 = v2[k];
         *             if (c1 != c2) {
         *                 return c1 - c2;
         *             }
         *             k++;
         *         }
         *         return len1 - len2;
         *     }
         *
         */

    }
}
