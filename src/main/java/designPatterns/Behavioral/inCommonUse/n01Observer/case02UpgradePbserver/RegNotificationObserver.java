package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserver;

/**
 * Created by chenjinxin on 2021/3/26 下午1:44
 */
// 注册通知
public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
