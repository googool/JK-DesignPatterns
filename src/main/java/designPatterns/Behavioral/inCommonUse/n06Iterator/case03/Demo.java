package designPatterns.Behavioral.inCommonUse.n06Iterator.case03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/31 下午3:43
 */
public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator<String> iterator = names.iterator();
        System.out.println(iterator.next());
        System.out.println(names.remove("d"));
        System.out.println(names.remove("c"));
        System.out.println(iterator.next());// 并发修改异常：ConcurrentModificationException
    }
}