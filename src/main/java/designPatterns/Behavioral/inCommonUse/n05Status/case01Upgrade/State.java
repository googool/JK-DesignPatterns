package designPatterns.Behavioral.inCommonUse.n05Status.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/30 下午3:26
 */
public enum State {
    SUPER(1),
    CAPE(2),
    FIRE(3),
    SMALL(0);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
