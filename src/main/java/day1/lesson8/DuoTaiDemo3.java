package day1.lesson8;


class Person{
    public void eat(){
        System.out.println("吃饭");
    }
}

class Sperson extends Person{
    public void eat(){
        System.out.println("南方吃米饭");
    }

    public void learn(){
        System.out.println("南方人爱麻将");
    }
}

class Nperson extends Person{
    public void eat(){
        System.out.println("北方吃馍");
    }

    public void learn(){
        System.out.println("北方人搞科研");
    }
}

public class DuoTaiDemo3 {
    public static void main(String[] args){

        Person p = new Sperson();
        p.eat();

        Sperson sp = (Sperson) p;
        sp.learn();

        p = new Nperson();
        p.eat();
        Nperson np = (Nperson) p;
        np.learn();
    }
}
