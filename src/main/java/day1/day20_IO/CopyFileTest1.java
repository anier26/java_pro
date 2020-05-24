package day1.day20_IO;

import java.io.*;

public class CopyFileTest1 {
    public static void main(String[] args) throws IOException {

        String sourceFile = "b.txt";
        String fileName ="a.txt";

        readerFile1(sourceFile,fileName);
        readerFile2(sourceFile,fileName);
        readerFile3(sourceFile,fileName);
        readerFile4(sourceFile,fileName);
        readerFile5(sourceFile,fileName);

    }

    private static void readerFile3(String sourceFile,String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter bw=writerFile3(fileName);
        String line = null;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }

    private static void readerFile4(String sourceFile,String fileName) throws IOException {
        FileReader fir = new FileReader(sourceFile);
        FileWriter fw = writerFile4(fileName);
        int len = 0;
        char[] chs = new char[1024];
        while ((len = fir.read(chs))!=-1){
            fw.write(chs,0,len);
            fw.flush();
        }

        fir.close();
        fw.close();
    }

    private static void readerFile2(String sourceFile,String fileName) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(sourceFile));
        OutputStreamWriter osw =writerFile2(fileName);
        int len=0;
        char[] chs = new char[1024];

        while ((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
            osw.flush();
        }
        osw.close();
        isr.close();
    }

    private static void readerFile5(String sourceFile,String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = writerFile5(fileName);
        int by = 0;

        while ((by=fis.read()) !=-1){
            fos.write(by);
            fos.flush();
        }
        fis.close();
        fos.close();
    }

    //字符
    private static FileWriter writerFile4(String fileName) throws IOException {
        return new FileWriter(fileName);
 }

    //字符流
    private static BufferedWriter writerFile3(String fileName) throws IOException {
        return new BufferedWriter(new FileWriter(fileName));
    }

    //字节流
    private static BufferedOutputStream writerFile1(String fileName) throws IOException {
        return new BufferedOutputStream(new FileOutputStream(fileName));
    }

    //字节流
    private static FileOutputStream writerFile5(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }

    private static OutputStreamWriter writerFile2(String fileName) throws FileNotFoundException {
        return new OutputStreamWriter(new FileOutputStream(fileName));
    }

    private static void readerFile1(String sourceFile,String fileName) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream bos = writerFile1(fileName);
        int ch= 0;
        while ((ch = bis.read())!=-1){
            bos.write(ch);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
