package day1.lesson9;

/**
 * 形式参数问题:
 *    基本类型(不讲)
 *    引用类型:
 *       类名: 需要的是该类的子类对象
 *       抽象类名: 需要的是该抽象类的子类对象
 *       接口: 需要的是该接口实现类对象
 *
 * 返回值类型问题:
 *    基本类型:(不讲)
 *    引用类型:
 *        类: 返回的是该类的子类对象
 *        抽象类: 返回的是该抽象类的子类对象
 *        接口: 返回的是该接口的实现类对象
 *
 *
 *
 *
 *
 *
 */

abstract class Animal3{
    private int age;
    private String name;

    public Animal3(){}

    public Animal3(int age, String name){
        this.name = name;
        this.age = age;
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

    public abstract void eat();
    public void sleep(){
        System.out.println("睡觉");
    };
}

interface jumpInter{

    public abstract void jump();
}

class Dog5 extends Animal3{
    public Dog5(){}

    public Dog5(int age,String name){
        super(age,name);
    }

    public void eat(){
        System.out.println("狗吃肉");
    }

    public void sleep(){
        System.out.println("狗趴着睡");
    }
}
class Cat5 extends Animal3{
    public Cat5(){}

    public Cat5(int age,String name){
        super(age,name);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void sleep(){
        System.out.println("猫站着睡");
    }
}

class JumpDog extends Dog5 implements jumpInter{
    public JumpDog(){}

    public JumpDog(int age, String name){
        super(age, name);
    }

    public void jump(){
        System.out.println("狗实现调高了");
    }
}

class JumpCat extends Cat5 implements jumpInter{
    public JumpCat(){}

    public JumpCat(int age, String name){
        super(age, name);
    }

    public void jump(){
        System.out.println("猫实现调高了");
    }
}

public class InterfaceTest {
    public static void main(String[] args){

        Animal3 animal3 = new Dog5(1,"aa");
        animal3.eat();
        animal3.sleep();  //子类在继承过去就会直接从写父类相同名字的方法
        System.out.println(animal3.getName() + "===" + animal3.getAge());

        System.out.println("====================");
        animal3.setName("aha");
        animal3.setAge(1);
        System.out.println(animal3.getName() + "===" + animal3.getAge());

        //定义调高猫
        jumpInter jm = new JumpDog();
        animal3.eat();
        animal3.sleep();
        jm.jump();
        System.out.println(animal3.getName() + "===" + animal3.getAge());

        System.out.println("====================");
        System.out.println("====================");
        animal3 = new Cat5(1,"jack");
        animal3.eat();
        System.out.println(animal3.getName() + "===" + animal3.getAge());

        System.out.println("====================");

        jumpInter jmc = new JumpCat(1,"aniu");
        animal3.eat();
        jmc.jump();
        animal3.sleep();
        System.out.println(animal3.getName() + "===" + animal3.getAge());

        System.out.println("====================");
        //改名:
        animal3.setName("tom");
        animal3.setAge(2);
        System.out.println(animal3.getName() + "===" + animal3.getAge());


        // 非多态版实现:
        JumpCat jc = new JumpCat(1,"大黄");
        jc.eat();
        jc.sleep();
        jc.jump();
        System.out.println(jc.getName() + "===" + jc.getAge());

    }
}
