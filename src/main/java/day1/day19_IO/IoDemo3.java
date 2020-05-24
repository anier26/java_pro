package day1.day19_IO;

import java.io.File;

public class IoDemo3 {
  public static void main(String[] args){

      File file = new File("C:\\Users\\anier\\Downloads\\test");
      file.delete(); //先删除子文件夹才能删父文件夹,要删除一个文件夹必须保证这个文件夹是空的,否则会删除失败

  }
}
