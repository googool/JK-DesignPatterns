package designPatterns.structural.inCommonUse.n04Adapter.case01Class;

/**
 * Created by chenjinxin on 2021/3/24 上午9:34
 */
public class Adaptor extends Adaptee implements ITarget {
    public void f1() {
        super.fa();
    }

    public void f2() {
        super.fb();
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
