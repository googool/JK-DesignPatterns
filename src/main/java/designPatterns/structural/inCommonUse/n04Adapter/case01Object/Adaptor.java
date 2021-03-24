package designPatterns.structural.inCommonUse.n04Adapter.case01Object;

/**
 * Created by chenjinxin on 2021/3/24 上午9:37
 */
public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa(); //委托给Adaptee
    }

    public void f2() {
        adaptee.fb(); //委托给Adaptee
    }

    public void f3() {
        adaptee.fc(); //委托给Adaptee
    }
}
