package designPatterns.Behavioral.uncommonlyUsed.n08Memento.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/31 下午5:56
 */

public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }
}
