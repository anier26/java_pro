package day1.day18_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args){

        HashMap<String,Student> hashMap = new HashMap();
        Student s1 = new Student(1,"aha");
        Student s2 = new Student(11,"hello");
        Student s3 = new Student(23,"world");
        Student s4 = new Student(17,"java");
        Student s5 = new Student(31,"anan");

        hashMap.put("001",s1);
        hashMap.put("002",s2);
        hashMap.put("003",s3);
        hashMap.put("004",s4);
        hashMap.put("005",s5);

        Set<String> keys = hashMap.keySet();
        for(String str: keys){
            System.out.print(str + " ");
            Student student = hashMap.get(str);
            System.out.println(student.getAge() + "=========" + student.getName());
        }
    }
}
