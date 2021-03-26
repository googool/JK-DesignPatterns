package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

import designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserver.NotificationService;

/**
 * Created by chenjinxin on 2021/3/26 下午2:07
 */
public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
