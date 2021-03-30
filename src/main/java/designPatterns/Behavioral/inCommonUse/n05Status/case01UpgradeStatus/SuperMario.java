package designPatterns.Behavioral.inCommonUse.n05Status.case01UpgradeStatus;

import designPatterns.Behavioral.inCommonUse.n05Status.case01Upgrade.State;

/**
 * Created by chenjinxin on 2021/3/30 下午3:34
 */

public class SuperMario implements IMario {
    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing...
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
