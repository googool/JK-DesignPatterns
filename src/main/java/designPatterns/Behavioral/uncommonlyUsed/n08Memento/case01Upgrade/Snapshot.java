package designPatterns.Behavioral.uncommonlyUsed.n08Memento.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/31 下午5:56
 */
public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
