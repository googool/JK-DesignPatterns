package designPatterns.Behavioral.uncommonlyUsed.n10Interpreter.case01UpgradeInterpreter;

/**
 * Created by chenjinxin on 2021/4/1 上午10:32
 */
public class AdditionExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public AdditionExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}