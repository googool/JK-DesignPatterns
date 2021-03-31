package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case02;

/**
 * Created by chenjinxin on 2021/3/31 下午5:15
 */
public class DemoMain {
    public static void main(String[] args) {
        SingleDispatchClass demo = new SingleDispatchClass();
        ParentClass p = new ChildClass();
        demo.polymorphismFunction(p);//执行哪个对象的方法，由对象的实际类型决定
        demo.overloadFunction(p);//执行对象的哪个方法，由参数对象的声明类型决定
    }
}
//代码执行结果:
//I am ChildClass's f().
//I am overloadFunction(ParentClass p).
