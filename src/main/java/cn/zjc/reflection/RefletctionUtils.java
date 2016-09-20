package cn.zjc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author zhangjinci
 * @version 2016/9/18 14:31
 * @function
 */
public class RefletctionUtils {

    public Class<?> getInstance(String className) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clazz;
    }

    public void method(Class<?> clazz) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException {

        int modify = clazz.getModifiers();  //修饰符的整型
        String modifyName = Modifier.toString(modify); //修饰符的名称

        clazz.isPrimitive(); //判断是否基本类型

        System.out.println("修饰符名称:" + modifyName);
        clazz.getMethods();

        Field[] fields = clazz.getFields(); //获取所有public声明的属性,包括父类
        Field field = clazz.getField("xxxxx"); //根据名称获取public声明的属性
        fields = clazz.getDeclaredFields(); //获取本对象声明的全部修饰符的全部属性
        field = clazz.getDeclaredField("xxxxxx"); //根据名称获取本对象声明的全部修饰符的全部属性

        clazz.getConstructors();
        clazz.getConstructor(new Class[]{null});
        clazz.getDeclaredConstructors();
        clazz.getDeclaredConstructor(new Class[]{null});

        clazz.isAnnotationPresent(null);
        clazz.getAnnotation(null);
        clazz.getAnnotations();
        clazz.getDeclaredAnnotation(null);
        clazz.getDeclaredAnnotations();

        clazz.isAssignableFrom(String.class);

        clazz.getGenericInterfaces();
        clazz.getInterfaces();
        clazz.getAnnotatedInterfaces();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {

        }

    }
}
