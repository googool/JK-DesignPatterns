package designPatterns.Behavioral.inCommonUse.n05Status.case01;

/**
 * Created by chenjinxin on 2021/3/30 下午3:18
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
