package day1.day20_IO;

import java.io.*;

/**
 * 序列化流: 对象操作流
 *        将Java对象写入outputStream -- >>将对象写到输出流 --- >> 吧对象当流操作
 *
 * 反序列化流: 吧文本文件中的流对象数据或者网络中的流对象数据还原成对象 -->> 吧流当对象操作
 *
 *
 *
 *
 */

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student stu = new Student("aha",1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos_obj.txt"));
        oos.writeObject(stu);

        oos.close();
    }
}
