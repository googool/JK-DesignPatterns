package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01ListUpgradeTemplate;

/**
 * Created by chenjinxin on 2021/3/30 下午1:49
 */

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}





// HandlerChain和Application代码不变
