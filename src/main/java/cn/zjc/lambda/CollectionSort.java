package cn.zjc.lambda;

import java.util.Arrays;


/**
 * @author zhangjinci
 * @version 2016/8/30 11:05
 * @function
 */
public class CollectionSort {

    public static void main(String[] args) {
        String[] atp = {"zjc", "pp", "hello"};
        //lambda排序
        Arrays.sort(atp, (String s1, String s2) -> (s1.compareTo(s2)));

        System.out.println();
    }
}
