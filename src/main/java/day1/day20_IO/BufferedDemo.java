package day1.day20_IO;

import java.io.*;
import java.nio.Buffer;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));

        BufferedReader br = new BufferedReader(new FileReader("b.txt"));


//        for(int x=0;x<10; x++){
//            bw.write("hello" + x);
//            bw.newLine();
//            bw.flush();
//        }

        //读:
//        int len =0;
//        while ((len = br.read()) !=-1){
//            bw.write(len);
//        }

        String line = null;
        while ((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
