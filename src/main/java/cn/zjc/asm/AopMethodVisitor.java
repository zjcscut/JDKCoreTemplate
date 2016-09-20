package cn.zjc.asm;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author zhangjinci
 * @version 2016/9/20 18:44
 * @function
 */
public class AopMethodVisitor extends MethodVisitor implements Opcodes {

    public AopMethodVisitor(int i, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }


    @Override
    public void visitCode() {
        super.visitCode();
        this.visitMethodInsn(INVOKESTATIC, "cn/zjc/asm/AopInterceptor", "before", "()V", false);
    }

    @Override
    public void visitInsn(int i) {
        if (i >= IRETURN && i <= RETURN) {
            this.visitMethodInsn(INVOKESTATIC, "cn/zjc/asm/AopInterceptor", "after", "()V", false);
        }
        super.visitInsn(i);
    }
}
