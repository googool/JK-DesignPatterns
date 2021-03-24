package designPatterns.structural.inCommonUse.n04Adapter.case01Object;

/**
 * Created by chenjinxin on 2021/3/24 上午9:40
 */
public class Demo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adaptor adaptor = new Adaptor(adaptee);
        adaptor.f1();
        adaptor.f2();
        adaptor.f3();
    }
}
