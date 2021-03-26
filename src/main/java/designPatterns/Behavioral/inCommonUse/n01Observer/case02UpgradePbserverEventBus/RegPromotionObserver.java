package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

import designPatterns.Behavioral.inCommonUse.n01Observer.case02.PromotionService;

/**
 * Created by chenjinxin on 2021/3/26 下午2:08
 */
public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
