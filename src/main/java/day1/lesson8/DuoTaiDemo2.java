package day1.lesson8;

class Animal{

    public void eat(){
        System.out.println("吃饭");
    }
}

class Dog extends Animal{

    public void eat(){
        super.eat();
        System.out.println("狗吃肉");
    }

    public void lookDoor(){
        System.out.println("狗看家");
    }
}


class Cat extends Animal{

    public void eat(){
        super.eat();
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫玩游戏");
    }
}

public class DuoTaiDemo2 {
    public static void main(String[] args){

        Animal a = new Dog();
        a.eat();
        System.out.println("===========还原狗子对象===============");

        // 吧父类引用还原成狗
        Dog d = (Dog) a;
        d.eat();
        d.lookDoor();

        System.out.println("===========父类引用指向猫=============");
        //吧父类引用指向猫:
        a = new Cat();
        a.eat();

        System.out.println("===========还原猫对象===============");

        Cat c = (Cat) a;
        c.eat();
        c.playGame();

    }
}
