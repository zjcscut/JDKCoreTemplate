package cn.zjc.lambda;

/**
 * @author zhangjinci
 * @version 2016/8/30 11:01
 * @function
 */
public class ThreadTest {

    public static void main(String[] args) {
        //使用lambda表达式,作用类似匿名内部类
        new Thread(() -> System.out.println("hello world")).start();

        //直接调用run方法，没有开启新的线程
        Runnable r = () -> System.out.println("hello lambda");
        r.run();
    }
}
