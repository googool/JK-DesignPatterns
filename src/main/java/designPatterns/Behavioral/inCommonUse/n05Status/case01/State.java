package designPatterns.Behavioral.inCommonUse.n05Status.case01;

/**
 * Created by chenjinxin on 2021/3/30 下午3:18
 */

public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
