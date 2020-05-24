package day1.day12_String;

public class StringDemo1 {
    public static void main(String[] args){
        String str1 = new String();
        System.out.println("str1: " + str1);
        System.out.println("str1: " + str1.length());

        byte[] bys = {97,98,99,100,101};
        String s2 = new String(bys);
        System.out.println("s2: " + s2); //abcde
        System.out.println("s2.length(): " + s2.length());

        char[] chr =  {'a','b','c','刘','意'};
        String s3 = new String(chr);
        System.out.println("s3: " + s3);
        System.out.println("s3.length(): " + s3.length());

        String s4 = new String(bys,1,3);
        System.out.println("s4: " + s4);
        System.out.println("s4.length(): " + s4.length());

        String s5 = new String(chr,2,3);
        System.out.println("s5: " + s5);
        System.out.println("s5.length(): " + s5.length());

    }
}
