package designPatterns.Behavioral.inCommonUse.n06Iterator.case03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/31 下午3:43
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator<String> iterator = names.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        iterator.remove();
        System.out.println(iterator.next());// 非法异常：IllegalStateException
    }
}