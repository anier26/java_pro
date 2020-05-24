package day1.lesson5;

public class Persion {

    private String name;
    private int age;
//    private String country;

    //共享国家成员变量:
    private static String country;


    public  Persion(){}

    public Persion(String name, int age){

        this.name = name;
        this.age = age;
    }


    public Persion(String name, int age, String country){

        this.name = name;
        this.age = age;
        this.country = country;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return  country;
    }


    public void show(){
        System.out.println(name+"=====" + age +"=====" + country );
    }

}
