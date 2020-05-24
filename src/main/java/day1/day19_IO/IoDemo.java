package day1.day19_IO;

import java.io.File;

public class IoDemo {
  public static void main(String[] args){

      /**
       * 吧C:\Users\anier\Downloads\a.txt 封装成一个file对象
       */
      File file = new File("C:\\Users\\anier\\Downloads\\a.txt");

      /**
       * 根据目录和一个子文件/目录得到一个file对象
       */
      File file2 = new File("C:\\Users\\anier\\Downloads","a.txt");

      File file3 = new File("C:\\Users\\anier\\Downloads");
      File file4 = new File(file3,"a.txt");

  }
}
