package designPatterns.Behavioral.uncommonlyUsed.n10Interpreter.case01UpgradeInterpreter;

/**
 * Created by chenjinxin on 2021/4/1 上午10:32
 */
public class NumberExpression implements Expression {
    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
