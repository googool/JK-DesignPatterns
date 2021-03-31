package designPatterns.Behavioral.inCommonUse.n06Iterator.case01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/30 下午5:55
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        Iterator<String> iterator = new ArrayIterator(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
