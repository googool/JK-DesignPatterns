package designPatterns.Behavioral.uncommonlyUsed.n10Interpreter.case02Upgrade;

import java.util.Map;

/**
 * Created by chenjinxin on 2021/4/1 上午10:40
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
