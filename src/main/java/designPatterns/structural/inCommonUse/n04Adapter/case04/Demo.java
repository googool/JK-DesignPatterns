package designPatterns.structural.inCommonUse.n04Adapter.case04;

/**
 * Created by chenjinxin on 2021/3/24 下午4:02
 */
// 替换依赖的外部系统
public class Demo {
    private I i;

    public Demo(I i) {
        this.i = i;
    }

    //...
    public static void main(String[] args) {
        Demo d = new Demo(new AAdaptor(new A()));
        d.i.f();
        // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
        // 只需要将BAdaptor如下注入到Demo即可。
        Demo d2 = new Demo(new BAdaptor(new B()));
        d2.i.f();
    }
}
