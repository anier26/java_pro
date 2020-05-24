package day1.day17_Set;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "aha", "hz");
        Student1 s5 = new Student1(1, "aha", "hz");
        Student1 s2 = new Student1(2, "aha1", "hz");
        Student1 s3 = new Student1(3, "aha2", "hz");
        Student1 s4 = new Student1(4, "aha2", "hz");
        Student1 s6 = new Student1(4, "aha3", "hz");

        //这里需要传递的是一个接口,真正也就是要接口的实现类对象,你在看这不就是compareable接口的实现类对象吗
        TreeSet<Student1> ts = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int num = o1.getName().length() - o2.getName().length();
                int num2 = num == 0? o1.getName().compareTo(o2.getName()): num;
                int num3 = num2 == 0? o1.getAge() - o2.getAge(): num2;
                return  num3;
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student1 stu: ts){
            System.out.println(stu.getName()+" " + stu.getAddr() + " " + stu.getAge());
        }
    }
}
