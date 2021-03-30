package designPatterns.Behavioral.inCommonUse.n05Status.case01UpgradeStatusUp;

import designPatterns.Behavioral.inCommonUse.n05Status.case01Upgrade.State;

/**
 * Created by chenjinxin on 2021/3/30 下午3:45
 */

public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
