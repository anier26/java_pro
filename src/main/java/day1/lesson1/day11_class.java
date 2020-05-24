package day1.lesson1;

/**
 * 控制语句:
 *     顺序结构  ---->> 从上到下, 依次执行
 *     选择结构
 *          if 选择结构 --->>三元都可以用if改,但是if不一定都能用三元改
 *                          如果执行结果是一个赋值操作,则可以改
 *              格式一:
 *                  if(比较表达式:){
 *                      语句体;
 *                  }
 *
 *              格式二:  --->> 如果if语句的执行结果是输出语句,那么就不能用三元改进,如果执行结果是一个赋值操作,则可以改
 *                  if(比较表达式){
 *                      语句体1;
 *                  }esls{
 *                      语句体2;
 *                  }
 *
 *              格式三:
 *                  if(比较表达式1){
 *                      语句体1;
 *                  }else if(比较表达式2){
 *                      语句体2;
 *                  }else if(比较表达式3){
 *                      语句体3;
 *                  }
 *                  ...
 *                  else{
 *                      语句体n+1;
 *                  }
 *
 *            执行流程:
 *              先判断比较表达式返回值是truefalse
 *              true: ---->> 执行表达式1;
 *              false: ---->> 执行表达式2;
 *
 *          switch 选择结构
 *     循环结构
 *
 *
 */

public class day11_class {
    public static void main(String[] args){
        int x = 100;
        int y = 200;
        int max;

        //if语句方式一:
        if(x == 100){
            System.out.println("x:" + x);
        }

        //if语句方式二:
        if(x>y){
            System.out.println("X:我是大哥");
        }else {
            System.out.println("y:妈的,老子是大哥!");
        }

        //if语句的第二种格式和三元运算符互相转换:

        if(x>y){
            max = x;
        }
        else {
            max = y;
        }
        System.out.println("max: " +max);

        System.out.println("========================");
        int max2=(x>y)?x:y;
        System.out.println("max2: " +max2);


    }
}