package designPatterns.Behavioral.uncommonlyUsed.n07Visitor.case02;

/**
 * Created by chenjinxin on 2021/3/31 下午5:15
 */
public class SingleDispatchClass {
    public void polymorphismFunction(ParentClass p) {
        p.f();
    }

    public void overloadFunction(ParentClass p) {
        System.out.println("I am overloadFunction(ParentClass p).");
    }

    public void overloadFunction(ChildClass c) {
        System.out.println("I am overloadFunction(ChildClass c).");
    }
}
