package designPatterns.Behavioral.inCommonUse.n05Status.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/30 下午3:24
 */

public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}


