package day1.day20_IO;

import java.io.*;


public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos_obj.txt"));
        Object obj = ois.readObject();
       System.out.println(obj);
    }
}
