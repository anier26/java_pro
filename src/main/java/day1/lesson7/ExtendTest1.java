package day1.lesson7;


class Animal{
    private int age;
    private String name;
    private String color;

    public Animal(){}

    public Animal(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}

class Cat extends Animal{
    public Cat(){}

    public Cat(int age, String name,String color){
        super(age,name,color);
    }

    public void playGame(){
        System.out.println("猫玩游戏");
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{

    public Dog(){}

    public Dog(int age,String name,String color){
        super(age,name,color);
    }


    public void lookDoor(){
        System.out.println("狗看家");
    }

    public void eat(){
        super.eat();
        System.out.println("狗爱吃肉");
    }
}


public class ExtendTest1 {
    public static void main(String[] args){

        Cat c= new Cat();

        c.setAge(1);
        c.setName("aha");
        c.setColor("灰色");
        System.out.println(c.getAge() + "==" + c.getName() + "==" + c.getColor());
        c.eat();
        c.playGame();
        System.out.println("============");
        Cat c2 = new Cat(1,"妍妍","橘色");
        System.out.println(c2.getAge() + "==" + c2.getName() + "==" + c2.getColor());
        c2.eat();
        c2.playGame();



        System.out.println("============");

        Dog d = new Dog();
        d.setAge(1);
        d.setName("巴哥哥");
        d.setColor("土黄");
        System.out.println(d.getAge() + "==" + d.getName() + "==" + d.getColor());
        d.eat();
        d.lookDoor();

        System.out.println("============");
        Dog d2 = new Dog(1,"lucky","白色");
        System.out.println(d2.getAge() + "==" + d2.getName() + "==" + d2.getColor());
        d2.eat();
        d2.lookDoor();
    }
}
