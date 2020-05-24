package day1.day19_IO;

import java.io.File;
import java.io.IOException;

public class IoDemo4 {
  public static void main(String[] args) throws IOException {

//      File file = new File("C:\\Users\\anier\\Downloads\\demo");
//      file.mkdir();
//      File file1 = new File(file,"a.txt");
//      System.out.println("createFile: " + file1.createNewFile());
//
//      System.out.println("===================");
////
//      File file2 = new File(file,"b.txt");
//      System.out.println( file1.renameTo(file2));

      /**
       *
       * rename()文件路径不一样表示剪切并改名:
//       */
      File file1 = new File("C:\\Users\\anier\\Downloads\\demo\\b.txt");
      File file3 = new File("C:\\Users\\anier\\Downloads\\aa.txt");
      System.out.println( file1.renameTo(file3));



  }
}
