package designPatterns.structural.inCommonUse.n04Adapter.case04;

/**
 * Created by chenjinxin on 2021/3/24 下午4:01
 */

// 将外部系统A替换成外部系统B
public class AAdaptor implements I {
    private A a;

    public AAdaptor(A a) {
        this.a = a;
    }

    public void f() {
        //...
        a.fa();
    }
}
