package day1.ArrayList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector vector = new Vector();
//        vector.add("hello");
//        vector.add("world");
//        vector.add("java");
//        vector.add("bagege");
        //特有功能:
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            String str = (String) enumeration.nextElement();
            System.out.println(str);
        }

        System.out.println("============");
        //for:
        for (int x=0; x<vector.size(); x++){
            String str = (String)(vector.elementAt(x));
            System.out.println(str);
        }


    }
}
