package designPatterns.structural.inCommonUse.n04Adapter.case04;

/**
 * Created by chenjinxin on 2021/3/24 下午4:01
 */

// 将外部系统A替换成外部系统B
public class BAdaptor implements I {
    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    public void f() {
        //...
        b.fb();
    }
}
