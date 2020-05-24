package day1.day18_Map;

import java.util.Objects;

public class Stu implements Comparable{
    private int age;
    private String name;

    public Stu() {
    }

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stu)) return false;
        Stu stu = (Stu) o;
        return getAge() == stu.getAge() &&
                Objects.equals(getName(), stu.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public int compareTo(Object o) {
        Stu stu = (Stu) o;
        int num = this.getAge() - stu.getAge();
        int num2 =num ==0? this.getName().compareTo(stu.getName()): num;
        return num2;
    }
}
