package designPatterns.Behavioral.inCommonUse.n06Iterator.case02;

import designPatterns.Behavioral.inCommonUse.n06Iterator.case01.Iterator;

/**
 * Created by chenjinxin on 2021/3/30 下午5:57
 */

public interface List<E> {
    Iterator iterator();
    //...省略其他接口函数...
}
