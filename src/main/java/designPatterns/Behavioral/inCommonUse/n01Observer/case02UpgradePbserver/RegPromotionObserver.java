package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserver;

import designPatterns.Behavioral.inCommonUse.n01Observer.case02.PromotionService;

/**
 * Created by chenjinxin on 2021/3/26 下午1:44
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
