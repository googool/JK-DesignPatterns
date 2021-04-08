package openSourceCombat.case04Spring.case01;

/**
 * Created by chenjinxin on 2021/4/8 下午4:59
 */

public abstract class ApplicationEvent extends EventObject {
    private static final long serialVersionUID = 7099057708183571937L;
    private final long timestamp = System.currentTimeMillis();

    public ApplicationEvent(Object source) {
        super(source);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}




