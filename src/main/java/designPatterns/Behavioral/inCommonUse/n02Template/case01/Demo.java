package designPatterns.Behavioral.inCommonUse.n02Template.case01;

/**
 * Created by chenjinxin on 2021/3/26 下午5:42
 */
public class Demo {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
