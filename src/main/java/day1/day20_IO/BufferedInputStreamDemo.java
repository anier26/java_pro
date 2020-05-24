package day1.day20_IO;

import java.io.*;

/**
 * 注意: 两种读取方式,在同一段代码中,针对同一个对象,只能使用读取一次
 *
 *
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));

        int by = 0;
        while ((by =bis.read()) != -1){
            System.out.print((char)by);
        }

//        System.out.println(bis.read());
//        System.out.println(bis.read());
//        System.out.println(bis.read());
//        System.out.println(bis.read());
//        System.out.println(bis.read());


        int len =0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) !=-1){
            System.out.print(new String(bys,0,len));
        }

        bis.close();
    }
}
