package designPatterns.Behavioral.inCommonUse.n06Iterator.case03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/31 下午3:54
 */

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        Iterator<String> iterator1 = names.iterator();
        Iterator<String> iterator2 = names.iterator();
        System.out.println(iterator1.next());
        iterator1.remove();
        iterator2.next(); // 运行结果？:ConcurrentModificationException
    }
}
