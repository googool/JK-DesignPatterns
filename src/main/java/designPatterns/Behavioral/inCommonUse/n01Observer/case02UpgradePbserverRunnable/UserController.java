package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverRunnable;

import designPatterns.Behavioral.inCommonUse.n01Observer.case02.UserService;
import designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserver.RegObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * Created by chenjinxin on 2021/3/26 下午2:00
 */
// 第二种实现方式，其他类代码不变，就没有再重复罗列
public class UserController {
    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();
    private Executor executor;

    public UserController(Executor executor) {
        this.executor = executor;
    }

    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observer.handleRegSuccess(userId);
                }
            });
        }

        return userId;
    }
}
