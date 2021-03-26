package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverRunnable;

import designPatterns.Behavioral.inCommonUse.n01Observer.case02.PromotionService;
import designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserver.RegObserver;

/**
 * Created by chenjinxin on 2021/3/26 下午2:00
 */

// 第一种实现方式，其他类代码不变，就没有再重复罗列
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(Long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                promotionService.issueNewUserExperienceCash(userId);
            }
        });
        thread.start();
    }
}