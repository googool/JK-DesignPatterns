package objectOriented.No10.case1.upgrade1;

/**
 * Created by chenjinxin on 2021/3/8 上午9:18
 */
public class Ostrich implements Tweetable, EggLayable {
    private final TweetAbility tweetAbility = new TweetAbility(); //组合
    private final EggLayAbility eggLayAbility = new EggLayAbility(); //组合
    @Override
    public void layEgg() {
        tweetAbility.tweet(); // 委托
    }

    @Override
    public void tweet() {
        eggLayAbility.layEgg(); // 委托
    }
}
