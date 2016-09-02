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
}
