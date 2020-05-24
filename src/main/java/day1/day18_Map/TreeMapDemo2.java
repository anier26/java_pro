package day1.day18_Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args){
        TreeMap<Student1,String> treeMap = new TreeMap<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0? o1.getName().compareTo(o2.getName()): num;
                return num2;
            }
        });
        Student1 s1 = new Student1(1,"aha");
        Student1 s2 = new Student1(17,"hello");
        Student1 s3 = new Student1(23,"world");
        Student1 s4 = new Student1(17,"java");
        Student1 s5 = new Student1(31,"kaikai");
        Student1 s6 = new Student1(31,"kaikai");

        treeMap.put(s1,"10001");
        treeMap.put(s2,"9527");
        treeMap.put(s3,"10200");
        treeMap.put(s4,"10086");
        treeMap.put(s5,"10076");
        treeMap.put(s6,"10076");

        Set<Student1> keys = treeMap.keySet();
        for(Student1 student : keys){
            String str = treeMap.get(student);
            System.out.println(str + "===" + student.getName() + "===" +student.getAge());
        }
    }
}
