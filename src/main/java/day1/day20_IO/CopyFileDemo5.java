package day1.day20_IO;

import java.io.*;

public class CopyFileDemo5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        FileInputStream fis = new FileInputStream("b.txt");

//        int by =0;
//        while ((by=fis.read())!=-1){
//            fos.write(by);
//        }
//
//        fos.close();
//        fis.close();

//        byte[] bys = new byte[1024];
//        int len = 0;
//        while ((len=fis.read(bys)) !=-1){
//            new FileOutputStream("aa.txt").write(bys,0,len);
//        }
//
//        fis.close();


//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));
//        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("a.txt"));
//        int by = 0;
//        while ((by = bis.read()) !=-1){
//            bos.write(by);
//        }
//
//        bis.close();
//        bos.close();


        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aa.txt"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));

        int len =0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
