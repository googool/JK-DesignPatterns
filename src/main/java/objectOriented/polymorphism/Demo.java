package objectOriented.polymorphism;

/**
 * Created by chenjinxin on 2021/3/5 下午2:05
 */
// 利用接口类来实现多态特性
interface Iterator {
    boolean hasNext();

    String next();

    String remove();
}

class Array implements Iterator {
    private String[] data;

    public boolean hasNext() { ...}

    public String next() { ...}

    public String remove() { ...}
    //...省略其他方法...
}

class LinkedList implements Iterator {
    private LinkedListNode head;

    public boolean hasNext() { ...}

    public String next() { ...}

    public String remove() { ...}
    //...省略其他方法...
}

public class Demo {
    private static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Iterator arrayIterator = new Array();
        print(arrayIterator);

        Iterator linkedListIterator = new LinkedList();
        print(linkedListIterator);
    }
}
