package designPatterns.Behavioral.uncommonlyUsed.n09Command.case01;

/**
 * Created by chenjinxin on 2021/4/1 上午10:16
 */
public enum Event {
    GOT_DIAMOND(0),
    GOT_STAR(1),
    HIT_OBSTACLE(2),
    ARCHIVE(3);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
