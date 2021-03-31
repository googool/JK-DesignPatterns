package designPatterns.Behavioral.inCommonUse.n06Iterator.case01;

/**
 * Created by chenjinxin on 2021/3/30 下午5:55
 */

// 接口定义方式一
public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}

// 接口定义方式二
/*public interface Iterator<E> {
    boolean hasNext();
    E next();
}*/
