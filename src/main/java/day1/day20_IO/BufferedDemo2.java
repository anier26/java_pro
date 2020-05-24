package day1.day20_IO;

import java.io.*;

public class BufferedDemo2 {
    public static void main(String[] args) throws IOException {
        String fileName ="a.txt";
        String SourcefileName ="b.txt";

        FileReaders(SourcefileName,fileName);

    }

    private static void FileReaders(String sourcefileName,String fileName) throws IOException {
        String line = null;
        BufferedReader br = new BufferedReader(new FileReader(sourcefileName));
        BufferedWriter bw = FileWrites(fileName);
        while ((line = br.readLine()) != null){
//           System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    private static BufferedWriter FileWrites(String fileName) throws IOException {
        return new BufferedWriter(new FileWriter(fileName));
    }
}
