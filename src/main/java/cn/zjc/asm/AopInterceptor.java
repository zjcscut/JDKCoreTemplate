package cn.zjc.asm;

/**
 * @author zhangjinci
 * @version 2016/9/20 18:46
 * @function
 */
public class AopInterceptor {

    public static void before() {
        System.out.println("...........before()..............");
    }

    public static void after() {
        System.out.println("..............after()...........");
    }
}
