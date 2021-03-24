package designPatterns.structural.inCommonUse.n04Adapter.case01Class;

/**
 * Created by chenjinxin on 2021/3/24 上午9:39
 */
public class Demo {
    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor();
        adaptor.f1();
        adaptor.f2();
        adaptor.fc();
    }
}
