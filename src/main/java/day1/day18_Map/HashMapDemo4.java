package day1.day18_Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {
    public static void main(String[] args){

        HashMap<Student,String> hashMap = new HashMap();
        Student s1 = new Student(1,"aha");
        Student s2 = new Student(17,"hello");
        Student s3 = new Student(23,"world");
        Student s4 = new Student(17,"java");
        Student s5 = new Student(31,"anan");
        Student s6 = new Student(31,"anan");

        hashMap.put(s1,"001");
        hashMap.put(s2,"002");
        hashMap.put(s3,"003");
        hashMap.put(s4,"004");
        hashMap.put(s5,"005");
        hashMap.put(s6,"006");

        Set<Student> keys = hashMap.keySet();
        for(Student student: keys){
            String str = hashMap.get(student);
            System.out.println(str + "===" + student.getAge() + "===" + student.getName());
        }


    }
}
