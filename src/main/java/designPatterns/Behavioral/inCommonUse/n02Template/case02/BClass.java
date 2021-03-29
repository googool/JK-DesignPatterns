package designPatterns.Behavioral.inCommonUse.n02Template.case02;

/**
 * Created by chenjinxin on 2021/3/29 下午1:42
 */
public class BClass {
    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}
