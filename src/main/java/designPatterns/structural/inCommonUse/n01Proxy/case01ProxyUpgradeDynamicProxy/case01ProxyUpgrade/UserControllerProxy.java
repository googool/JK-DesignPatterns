package designPatterns.structural.inCommonUse.n01Proxy.case01ProxyUpgradeDynamicProxy.case01ProxyUpgrade;

import designPatterns.structural.inCommonUse.n01Proxy.case01.MetricsCollector;
import designPatterns.structural.inCommonUse.n01Proxy.case01.RequestInfo;
import designPatterns.structural.inCommonUse.n01Proxy.case01.UserVo;

/**
 * Created by chenjinxin on 2021/3/22 下午4:35
 */

public class UserControllerProxy extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}

