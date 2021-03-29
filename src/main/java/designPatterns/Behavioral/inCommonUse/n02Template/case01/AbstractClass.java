package designPatterns.Behavioral.inCommonUse.n02Template.case01;

/**
 * Created by chenjinxin on 2021/3/26 下午5:42
 */

public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();
    protected abstract void method2();
}