package designPatterns.Behavioral.inCommonUse.n02Template.case02;

/**
 * Created by chenjinxin on 2021/3/29 下午1:42
 */
public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() { //回调对象
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }
}
