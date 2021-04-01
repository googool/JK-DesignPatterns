package designPatterns.Behavioral.uncommonlyUsed.n08Memento.case01Upgrade;

import java.util.Stack;

/**
 * Created by chenjinxin on 2021/3/31 下午5:56
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
