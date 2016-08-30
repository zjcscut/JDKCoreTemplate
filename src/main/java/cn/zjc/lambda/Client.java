package cn.zjc.lambda;

import cn.zjc.lambda.inte.Predicate;

/**
 * @author zhangjinci
 * @version 2016/8/30 10:38
 * @function
 */
public class Client {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;

        System.out.println(atLeast5.test(6));
    }
}
