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

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        writeObject();
        readObject();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        //床架反序列化对象:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Object o = ois.readObject();

        ois.close();
        System.out.println(o);
    }

    private static void writeObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

        Person p = new Person("aha",3);
        oos.writeObject(p);

        oos.close();
    }
}
