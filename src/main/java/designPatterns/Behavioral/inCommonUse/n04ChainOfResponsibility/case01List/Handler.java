package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01List;

/**
 * Created by chenjinxin on 2021/3/30 下午1:43
 */

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
