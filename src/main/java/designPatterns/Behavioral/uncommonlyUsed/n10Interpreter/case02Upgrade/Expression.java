package designPatterns.Behavioral.uncommonlyUsed.n10Interpreter.case02Upgrade;

import java.util.Map;

/**
 * Created by chenjinxin on 2021/4/1 上午10:40
 */

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
