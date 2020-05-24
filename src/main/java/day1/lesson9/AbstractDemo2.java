package day1.lesson9;

abstract class Animal1{
    private int age;
    private String name;

    public Animal1(){}

    public Animal1(int age, String name){
        this.name=name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public abstract void eat();


    public void show(){
        System.out.println("name: " + name + "===" + "age:" + age);
    }
}

class Dog1 extends Animal1{

    public Dog1(){ }

    public Dog1(int age, String name){
        super(age,name);

    }    public void eat(){
        System.out.println("狗吃肉");
    };

    public void lookdoor(){
        System.out.println("狗看家");
    }
}

class Cat1 extends Animal1 {
    public Cat1() {}

    public Cat1(int age, String name) {
        super(age,name);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫玩游戏");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args){
        Animal1 a = new Dog1(1,"anan");
        a.eat();
        a.show();

        /**
         * 其实也可以通过父类引用调用setX()赋值,这个方法本类就是父类的,儿子继承父类的以后也有的
         *
         */

        a.setName("jack");
        a.setAge(3);
        a.show();
        System.out.println("==========");

        Dog1 d1 = (Dog1) a;
        d1.setName("aha");
        d1.setAge(2);
        d1.eat();
        d1.lookdoor();
        d1.show();

        System.out.println("==========");

        a = new Cat1(1,"anan");
        a.eat();
        a.show();

        Cat1 c1 = (Cat1) a;
        c1.eat();
        c1.playGame();
        c1.show();

        System.out.println("==========");
        c1.setAge(2);
        c1.setName("jim");
        c1.show();
    }
}
