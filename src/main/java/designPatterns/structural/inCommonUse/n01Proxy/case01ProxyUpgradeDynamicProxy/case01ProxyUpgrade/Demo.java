package designPatterns.structural.inCommonUse.n01Proxy.case01ProxyUpgradeDynamicProxy.case01ProxyUpgrade;

/**
 * Created by chenjinxin on 2021/3/22 下午4:36
 */
public class Demo {
    public static void main(String[] args) {
        //UserControllerProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.login("171", "1499");
    }
}
