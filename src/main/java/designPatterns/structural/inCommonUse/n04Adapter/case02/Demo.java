package designPatterns.structural.inCommonUse.n04Adapter.case02;

/**
 * Created by chenjinxin on 2021/3/24 上午9:45
 */
// 1. 封装有缺陷的接口设计
public class Demo {
    public static void main(String[] args) {
        ParamsWrapperDefinition paramsWrapperDefinition = new ParamsWrapperDefinition(1, 2);
        CDAdaptor cdAdaptor = new CDAdaptor();
        cdAdaptor.function1();
        cdAdaptor.function2();
        cdAdaptor.function3(paramsWrapperDefinition);
        cdAdaptor.function4();
    }
}
