package cn.zjc.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangjinci
 * @version 2016/8/30 10:57
 * @function
 */
public class Loop {

    public static void main(String[] args){
        String[] atp = {"zjc","pp","hello"};
        List<String> list = Arrays.asList(atp);

        //lambda迭代
        list.forEach((l) -> System.out.println(l + " "));

        //Java 8 对象引用
        list.forEach(System.out::println);
    }
}
