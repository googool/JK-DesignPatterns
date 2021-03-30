package designPatterns.Behavioral.inCommonUse.n05Status.case01UpgradeStatus;

import designPatterns.Behavioral.inCommonUse.n05Status.case01Upgrade.State;

/**
 * Created by chenjinxin on 2021/3/30 下午3:34
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState; // 不再使用枚举来表示状态

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }

    public void obtainCape() {
        this.currentState.obtainCape();
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    public void meetMonster() {
        this.currentState.meetMonster();
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
