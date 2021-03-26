package designPatterns.structural.uncommonlyUsed.n07Flyweight.case03;

/**
 * Created by chenjinxin on 2021/3/26 上午9:50
 */
// 除了 Integer 类型之外，其他包装器类型，比如 Long、Short、Byte 等，也都利用了享元模式来缓存 -128 到 127 之间的数据。
// integer频繁的创建、回收，会造成内存碎片，不如申请一块连续内存，事先创建好。
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 56;
        Integer i2 = 56;
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        //true
        //false
    }
}
