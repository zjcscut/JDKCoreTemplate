package cn.zjc.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author zhangjinci
 * @version 2016/9/20 18:25
 * @function
 */
public class AopClassAdapter extends ClassVisitor implements Opcodes {

    public AopClassAdapter(int i, ClassVisitor classVisitor) {
        super(i, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
        MethodVisitor mv = super.visitMethod(i, s, s1, s2, strings);
        if (s.startsWith("test")){
            mv = new AopMethodVisitor(this.api,mv);
        }
        return mv;
    }
}
