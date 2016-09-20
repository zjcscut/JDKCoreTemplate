package cn.zjc.asm;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangjinci
 * @version 2016/9/20 18:51
 * @function
 */
public class Hello {

    // 声明 一个常量
    public static final String FLAG = "我是常量";

    // 普通方法
    public void display() {
        for (int i = 0; i < 8; i++) {
            System.out.println(">>>>>>>>>>" + FLAG);
        }
    }

    // 带有List返回值
    public List<String> testList() {
        List<String> list = new ArrayList<>();
        list.add("Tome");
        list.add("Jack");
        list.add("Lily");
        System.out.println(">>>>>>>>>>testList > list.size = " + list.size());
        return list;
    }

    // 泛型返回值，包含List和Map
    // 两个参数，参数为Map动参
    public List<Map<String, String>> testMapList(boolean val, Map<String, String>... map) {
        List<Map<String, String>> list = new ArrayList<>();
        if (val) {
            for (Map<String, String> m : map) {
                list.add(m);
            }
        }
        System.out.println(">>>>>>>>>>testMapList > list.size = " + list.size());
        return list;
    }

}
