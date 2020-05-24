package day1.day20_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("a.txt");
        //追加写入:
        FileOutputStream fos = new FileOutputStream("a.txt",true);

        for(int x=0; x<10; x++){
            fos.write(("hello" + x).getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
