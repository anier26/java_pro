package day1.day20_IO;

import day1.lesson5.Persion;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;

    public Person(){
        super();
    }


    public Person(String name, int age){
        this.name=name;
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
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
