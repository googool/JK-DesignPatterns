package objectOriented.No10.case1.upgrade2;

/**
 * Created by chenjinxin on 2021/3/8 上午9:18
 */
public class Ostrich implements Tweetable, EggLayable {
    @Override
    public void layEgg() {
        Tweetable.super.tweet(); // 委托
    }

    @Override
    public void tweet() {
        EggLayable.super.layEgg(); // 委托
    }
}
