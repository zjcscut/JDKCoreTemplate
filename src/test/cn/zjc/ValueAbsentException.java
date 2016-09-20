package cn.zjc;

/**
 * @author zhangjinci
 * @version 2016/9/7 10:58
 * @function
 */
public class ValueAbsentException extends Throwable {

    public ValueAbsentException() {
        super();
    }

    public ValueAbsentException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "no value present in the optional instance";
    }
}
