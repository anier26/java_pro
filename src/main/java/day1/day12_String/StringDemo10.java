package day1.day12_String;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        System.out.print("请输入字符串: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(getStr(str));
        System.out.print(getStr2(str));
    }

    public static String getStr(String str){
        char[] ch = str.toCharArray();
        for(int x=0; x<ch.length/2; x++){
            char tmp = ch[ch.length-1-x];
            ch[ch.length-1-x] = ch[x];
            ch[x] = tmp;
        }
        str = String.valueOf(ch);
        return str;
    }

    public static String getStr2(String str){
        String str1 = "";
        for (int x=str.length()-1 ; x>=0; x--){
            str1 += str.charAt(x);
        }
        return str1;
    }
}
