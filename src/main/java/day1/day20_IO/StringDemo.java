package day1.day20_IO;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 默认utf-8本地编码:
        String s="你好";
//        byte[] bys = s.getBytes();
//        System.out.println(Arrays.toString(bys));
//
//        String ss = new String(bys);
//        System.out.println(ss);


        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys)); //[-60, -29, -70, -61]

        String ss = new String(bys, "GBK"); //你好
        System.out.println(ss);


    }

}
