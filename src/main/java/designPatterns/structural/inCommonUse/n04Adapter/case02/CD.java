package designPatterns.structural.inCommonUse.n04Adapter.case02;

/**
 * Created by chenjinxin on 2021/3/24 上午9:46
 */

public class CD { //这个类来自外部sdk，我们无权修改它的代码
    //...
    public static void staticFunction1() {
        System.out.println("staticFunction1");
    }

    public void uglyNamingFunction2() {
        System.out.println("uglyNamingFunction2");
    }

    public void tooManyParamsFunction3(int paramA, int paramB) {
        System.out.println("tooManyParamsFunction3: " + (paramA + paramB));
    }

    public void lowPerformanceFunction4() {
        System.out.println("lowPerformanceFunction4");
    }
}



