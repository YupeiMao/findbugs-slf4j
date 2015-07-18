package jp.skypencil.findbugs.slf4j.parameter;

import javax.annotation.Nonnull;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;

import edu.umd.cs.findbugs.OpcodeStack.Item;

public class ThrowableHandler {
    @Nonnull
    private static final JavaClass THROWABLE;

    static {
        try {
            THROWABLE = Repository.lookupClass(Throwable.class);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Unreachable");
        }
    }

    /**
     * @return true if given Item is throwable
     */
    public boolean checkThrowable(Item stackItem) {
        try {
            JavaClass typeOfStack = stackItem.getJavaClass();
            if (typeOfStack == null) {
                // means primitive or array
                return false;
            }
            return typeOfStack.instanceOf(THROWABLE);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Unreachable");
        }
    }

}
