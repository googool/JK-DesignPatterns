package openSourceCombat.case04Spring.case01;

/**
 * Created by chenjinxin on 2021/4/8 下午4:56
 */

// Event事件
public class DemoEvent extends ApplicationEvent {
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
    }

    public String getMessage() {
        return this.message;
    }
}




