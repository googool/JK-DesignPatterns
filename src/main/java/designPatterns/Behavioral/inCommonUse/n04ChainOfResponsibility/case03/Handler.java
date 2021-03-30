package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case03;

/**
 * Created by chenjinxin on 2021/3/30 下午2:06
 */

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
