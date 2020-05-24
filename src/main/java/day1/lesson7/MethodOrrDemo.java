package day1.lesson7;

/**
 * 方法重写: 子类中出现了和父类中方法声明一模一样的方法(方法声明一模一样包括方法名和参数列表以及返回值类型)
 *
 * 方法重写的应用: 当子类需要父类功能,而功能主体又有自己特有内容时,可以重写父类中的方法
 *               这样,即沿袭了父类功能,又保留了子类自己特有功能
 *
 * 注意: 父类中的私有方法不能被子类重写
 *      子类重写父类方法时,访问权限不能更低,最好一致
 *      父类静态方法,子类也必须同静态方法进行重写
 *
 *  子类重写父类方法时,最好声明一模一样,包括修饰符
 */
class Phone{

    public void call(String name){
        System.out.println("给"+ name + "打电话");
    }
}

class NewPhone extends Phone{

    public void call(String name){
        super.call("anier");  //super来调用父亲的打电话功能,继续保留儿子看天气预报功能
//        System.out.println("给"+ name + "打电话");
        System.out.println("天气预报");
    }
}


public class MethodOrrDemo {
    public static void main(String[] args){

        NewPhone np = new NewPhone();
        np.call("aha");
    }
}
