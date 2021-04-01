package designPatterns.Behavioral.uncommonlyUsed.n08Memento.case01;

import java.util.Stack;

/**
 * Created by chenjinxin on 2021/3/31 下午5:52
 */
public class SnapshotHolder {
    private Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(InputText inputText) {
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }
}
