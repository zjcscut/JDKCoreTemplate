package cn.zjc.lambda;

import cn.zjc.common.entity.City;
import cn.zjc.common.entity.Person;

import java.util.Optional;

/**
 * @author zhangjinci
 * @version 2016/8/31 9:09
 * @function
 */
public class OptionalTest {
    public static void main(String[] args) {
        City c = new City(1, "Guangzhou");

        Person p = new Person(1, "zjc", c);
        String city = Optional.ofNullable(p).map(x -> x.getCity()).map(x -> x.getName())
                .orElse(null);
        System.out.println(city);

        String s = "Hello World";
        System.out.println(toLowerCase(s));
        System.out.println(replaceStr(s, "World", "Java"));

    }

    private static String toLowerCase(String text) {
        return Optional.ofNullable(text).map(x -> x.toLowerCase()).orElse(null);
    }

    private static String replaceStr(String origin, String oldStr, String newStr) {
        return Optional.ofNullable(origin).map(x -> x.replace(oldStr, newStr)).orElse(null);
    }


    //of
    private static String of(){
        Optional<String> name = Optional.of("zjc");
        if (name.isPresent())
            return name.get();
        return null;
    }


}
