package designPatterns.structural.inCommonUse.n01Proxy.case01ProxyUpgrade;

import designPatterns.structural.inCommonUse.n01Proxy.case01.MetricsCollector;
import designPatterns.structural.inCommonUse.n01Proxy.case01.RequestInfo;
import designPatterns.structural.inCommonUse.n01Proxy.case01.UserVo;

/**
 * Created by chenjinxin on 2021/3/22 下午4:35
 */

/**
 * 如果原始类并没有定义接口，并且原始类代码并不是我们开发维护的（比如它来自一个第三方的类库），我们也没办法直接修改原始类，给它重新定义一个接口。
 * 在这种情况下，我们该如何实现代理模式呢？
 *
 * 对于这种外部类的扩展，我们一般都是采用继承的方式。这里也不例外。我们让代理类继承原始类，然后扩展附加功能。
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

