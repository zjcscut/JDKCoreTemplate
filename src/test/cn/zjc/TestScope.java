package cn.zjc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Optional;

/**
 * @author zhangjinci
 * @version 2016/8/31 15:10
 * @function
 */
public class TestScope {

    @Test
    public void Test1() {
        StringBuffer buffer = new StringBuffer("剩余应还总金额(839.8)=提现手续费(3.96)+利息(35.84)+本金(800.0)+");

    }


    //of操作
    @Test
    public void of() {
        Optional<String> name = Optional.of("zjc");
        if (name.isPresent()) {
            assertEquals("zjc", name.get());
        }

        Optional<String> someNull = Optional.of(null); //会抛出空指针异常
    }

    //ofNullable
    @Test
    public void ofNullable() {
        Optional<String> someNull = Optional.ofNullable(null);
    }

    //isPresent (用于判断Optional实例中是否包含值)
    @Test
    public void isPresent() {
        Optional<String> someNull = Optional.ofNullable(null);
        assertEquals(true, someNull.isPresent()); //false，因为someNull里面的没有值
    }

    //get
    @Test
    public void get() {
        Optional<String> someNull = Optional.ofNullable(null);
        someNull.get();
    }

    //ifPresent
    @Test
    public void ifPresent() {
        Optional<String> s = Optional.ofNullable("zjc");
        s.ifPresent((x) -> System.out.println(x.toLowerCase()));
    }

    //orElse
    @Test
    public void orElse() {
        String ss = null;
        String s = Optional.ofNullable(ss).orElse("zjc");
        assertEquals("zjc", s);
    }

    //orElseGet
    @Test
    public void orElseGet() {
        String s = null;
        String de = Optional.ofNullable(s).orElseGet(() -> "default value");
        System.out.println(de);
    }

    //orElseThrow
    @Test
    public void orElseThrow(){
        String s = null;
        try {
            Optional.ofNullable(s).orElseThrow(ValueAbsentException::new);
        } catch (ValueAbsentException e) {
            e.printStackTrace();
        }
    }

    //map(返回一个optional对象)
    @Test
    public void map(){
        String UpName = "ZJC";
        String name = Optional.ofNullable(UpName).map(String::toLowerCase).get();
        System.out.println(name);
    }

    //flatMap
    @Test
    public void flatMap(){
        String UpName = "ZJC";
        String name = Optional.ofNullable(UpName).flatMap((val) -> Optional.of(val.toLowerCase())).get();
        System.out.println(name);
    }

    //filter
    @Test
    public void filter(){
        Optional<String> upNmae = Optional.ofNullable("zjcscut");
        String name = upNmae.filter((val)-> val.length() <6).orElse("no value");
        System.out.println(name);
    }
}
