package designPatterns.Behavioral.inCommonUse.n06Iterator.case02;

import designPatterns.Behavioral.inCommonUse.n06Iterator.case01.ArrayIterator;
import designPatterns.Behavioral.inCommonUse.n06Iterator.case01.Iterator;

/**
 * Created by chenjinxin on 2021/3/30 下午5:58
 */
public class ArrayList<E> implements List<E> {
    //...
    public Iterator iterator() {
//        return new ArrayIterator(this);
        return null;
    }

    //...省略其他代码
}
