package designPatterns.structural.inCommonUse.n04Adapter.case02;

/**
 * Created by chenjinxin on 2021/3/24 上午9:47
 */
// 注意：适配器类的命名不一定非得末尾带Adaptor
public class CDAdaptor extends CD implements ITarget {
    @Override
    public void function1() {
        staticFunction1();
    }

    @Override
    public void function2() {
        super.uglyNamingFunction2();
    }

    @Override
    public void function3(ParamsWrapperDefinition paramsWrapper) {
        super.tooManyParamsFunction3(paramsWrapper.paramA, paramsWrapper.paramB);
    }

    @Override
    public void function4() {
        super.lowPerformanceFunction4();
    }
}
