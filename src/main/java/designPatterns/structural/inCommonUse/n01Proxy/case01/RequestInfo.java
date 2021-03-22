package designPatterns.structural.inCommonUse.n01Proxy.case01;

/**
 * Created by chenjinxin on 2021/3/22 下午4:32
 */
public class RequestInfo {
    private String funName;
    private long responseTime;
    private long startTimestamp;

    public RequestInfo(String funName, long responseTime, long startTimestamp) {
        this.funName = funName;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }
}
