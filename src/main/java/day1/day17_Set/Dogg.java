package day1.day17_Set;

import java.util.Objects;

public class Dogg {
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dogg(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Dogg{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex=" + sex +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dogg)) return false;
        Dogg dogg = (Dogg) o;
        return getAge() == dogg.getAge() &&
                getSex() == dogg.getSex() &&
                Objects.equals(getName(), dogg.getName()) &&
                Objects.equals(getColor(), dogg.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColor(), getSex());
    }
}
