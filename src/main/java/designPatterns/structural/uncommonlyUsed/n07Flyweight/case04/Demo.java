package designPatterns.structural.uncommonlyUsed.n07Flyweight.case04;

/**
 * Created by chenjinxin on 2021/3/26 上午10:08
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = "小争哥";
        String s2 = "小争哥";
        String s3 = new String("小争哥");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        //true
        //false
    }
}
