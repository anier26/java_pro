package day1.day17_Set;


import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args){
        HashSet<Dogg> hashSet = new HashSet<>();
        Dogg dogg = new Dogg("aha",1,"yello", '男');
        Dogg dogg1 = new Dogg("aha1",1,"yello", '男');
        Dogg dogg2 = new Dogg("aha2",1,"yello", '男');
        Dogg dogg3 = new Dogg("aha",1,"yello",'男');
        Dogg dogg4 = new Dogg("aha",1,"yello",'男');

        hashSet.add(dogg);
        hashSet.add(dogg1);
        hashSet.add(dogg2);
        hashSet.add(dogg3);
        hashSet.add(dogg4);

        for(Dogg dog: hashSet){
            System.out.println(dog.getName()+" " + dog.getColor()+ " " +dog.getAge()+ " "
                +dog.getSex()
            );
        }
    }
}
