package designPatterns.Behavioral.uncommonlyUsed.n10Interpreter.case02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/4/1 上午10:38
 */
public class DemoTest {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 101l);
        stats.put("key3", 121l);
        stats.put("key4", 88l);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }
}
