package cn.zjc.asm;

import org.objectweb.asm.Opcodes;

/**
 * @author zhangjinci
 * @version 2016/9/20 18:52
 * @function
 */
public class CustomClassLoader extends ClassLoader implements Opcodes {

    public CustomClassLoader() {
        super();
    }

    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    public Class<?> loadClass(String name, byte[] b) {
        return super.defineClass(name, b, 0, b.length);
    }
}
