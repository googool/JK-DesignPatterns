package designPatterns.structural.inCommonUse.n04Adapter.case02;

/**
 * Created by chenjinxin on 2021/3/24 上午9:46
 */
// 使用适配器模式进行重构
public interface ITarget {
    void function1();

    void function2();

    void function3(ParamsWrapperDefinition paramsWrapper);

    void function4();
}
