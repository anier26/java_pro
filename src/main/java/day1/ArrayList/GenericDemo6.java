package day1.ArrayList;



import java.util.ArrayList;
import java.util.Collection;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class GenericDemo6 {
    public static void main(String[] args){
        //? 表示任意类型都可以
        Collection<?> c1 = new ArrayList<String>();
        Collection<?> c2 = new ArrayList<Integer>();
        Collection<?> c3 = new ArrayList<Dog>();
        Collection<?> c4 = new ArrayList<Cat>();

        // ? extends --- >>表示向下限定
        Collection<? extends Animal> c5 = new ArrayList<Animal>();
        Collection<? extends Animal> c6 = new ArrayList<Dog>();
        Collection<? extends Animal> c7 = new ArrayList<Cat>();

        // ? super --- >>向上限定:
        Collection<? super Dog> c8 = new ArrayList<Animal>();
        Collection<? super Dog> c9 = new ArrayList<Object>();
        Collection<? super Dog> c10 = new ArrayList<Dog>();


    }
}
