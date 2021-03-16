package designPatterns.pattern01singleton.implementTheSingletonPattern.case05Enumeration;

/**
 * Created by chenjinxin on 2021/3/16 下午5:02
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(IdGenerator.INSTANCE.getId());
        System.out.println(IdGenerator.INSTANCE.getId());
    }
}
