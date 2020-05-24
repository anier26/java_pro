package day1.lesson1;

import java.sql.Array;
import java.util.Arrays;

/**
 * 关键字: 被java语言赋予特定含义的单词
 * 特点: 组成关键字的字母全部小写
 *
 * 标识符: 给类接口方法变量等起名字
 * 组成规则:
 *    A:英文字母大小写
 *    B:数字字符
 *    C:$和_下划线
 *
 * 注意事项: 不能以数字开头
 *          不能是java关键字
 *
 * 类或接口:
 *    一个单词:单词的首字母必须大写
 *    多个单词,从第二个单词开始每个单词的首字母必须大写
 *
 * 常量: 在程序执行过程中,起值不发生改变的量
 * 分类:
 *    字面值常量
 *        A.字符串常量: ""双引号括起来的内容 “helloworld”
 *        B.整数常量: 所有的整数 23,12
 *        C.小数常量: 所有的小数 12.21
 *        D.字符常量：''用单引号括起来的内容 'a','A','0'
 *        E.布尔常量: true,false
 *        F.空常量: null
 *
 *    自定义常量
 *
 *    一个单词:全部大写 PI
 *    多个单词:每个单词首字母全部大写,用_隔开
 *
 *
 */

public class  day1_class {
    public static void main(String[] args){
//        System.out.println("hello world");
//        System.out.println(20);
//        System.out.println(12.325);
//        System.out.println(true);
//        System.out.println('a');
//        System.out.println('好');
//        System.out.println("");
//        System.out.println("我爱你");
//        int[] arr = {1,2,3};
//        int[] arr2 = Arrays.copyOf(arr,1);
//
        int[] array = new int[]{1,2,3,4,5,6,90,17,25,78,93,28};
        getEvenNumber(array);


//        short s = 1;
//
//        System.out.println(s+1);

        int a = 10;
        int b = 20;
        a=(a+b)-(b=a);
        System.out.println("a: " + a + ",b: " +b);
    }

    private static void getEvenNumber(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++){
            if (arr[x] %2 == 0){
               if(x == arr.length-1){
                   System.out.println(arr[x] + "]");
               }else {
                   System.out.print(arr[x] + ",");
               }
            }
        }
    }


}
