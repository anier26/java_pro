package day1.day18_Map;

import java.util.Objects;

public class Student1 {
    private int age;
    private String name;

    public Student1(){}

    public Student1(int age, String name){
        this.name = name;
        this.age = age;
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
        if (!(o instanceof Student1)) return false;
        Student1 student = (Student1) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}
